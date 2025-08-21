import logging
import os
import shutil
from operator import or_

from flask import Blueprint, request, jsonify
from flask import redirect, url_for, flash
from flask import render_template

from models import db, Project

model_bp = Blueprint('model', __name__)

logger = logging.getLogger(__name__)

@model_bp.route('/models', methods=['GET'])
def models():
    # 适配 pageNo 和 pageSize 参数
    try:
        page_no = int(request.args.get('pageNo', 1))  # 默认第1页
        page_size = int(request.args.get('pageSize', 10))  # 默认每页10条
        search = request.args.get('search', '').strip()

        # 参数校验
        if page_no < 1 or page_size < 1:
            return jsonify({
                'code': 400,
                'msg': '参数错误：pageNo和pageSize必须为正整数'
            }), 400

        # 构建查询（支持搜索）
        query = Project.query
        if search:
            query = query.filter(
                or_(
                    Project.name.ilike(f'%{search}%'),
                    Project.description.ilike(f'%{search}%')
                )
            )

        # 执行分页查询
        pagination = query.paginate(
            page=page_no,
            per_page=page_size,
            error_out=False
        )

        # 构建响应
        model_list = [{
            'id': p.id,
            'name': p.name,
            'description': p.description,
            'created_at': p.created_at.isoformat() if p.created_at else None
        } for p in pagination.items]

        return jsonify({
            'code': 200,
            'msg': 'success',
            'data': model_list,
            'pagination': {
                'pageNo': pagination.page,  # 当前页码
                'pageSize': pagination.per_page,  # 每页数量
                'totalItems': pagination.total,  # 总记录数
                'totalPages': pagination.pages  # 总页数
            }
        })

    except ValueError:  # 参数类型错误
        return jsonify({
            'code': 400,
            'msg': '参数类型错误：pageNo和pageSize需为整数'
        }), 400

    except Exception as e:
        logger.error(f'分页查询失败: {str(e)}')
        return jsonify({
            'code': 500,
            'msg': '服务器内部错误'
        }), 500

@model_bp.route('/model/<int:model_id>')
def model_detail(model_id):
    model = Project.query.get_or_404(model_id)
    return render_template('model_detail.html', model=model)

@model_bp.route('/model/create', methods=['POST'])
def create_model():
    name = request.form.get('name')
    description = request.form.get('description')

    if not name:
        flash('项目名称不能为空', 'error')
        return redirect(url_for('main.index'))

    model = Project(name=name, description=description)
    db.session.add(model)
    db.session.commit()

    flash(f'项目 "{name}" 创建成功', 'success')
    return redirect(url_for('main.model_detail', model_id=model.id))

@model_bp.route('/model/<int:model_id>/delete', methods=['POST'])
def delete_model(model_id):
    model = Project.query.get_or_404(model_id)
    model_name = model.name

    # 删除项目相关的所有文件
    model_path = os.path.join('data/datasets', str(model_id))
    if os.path.exists(model_path):
        shutil.rmtree(model_path)

    # 删除项目记录
    db.session.delete(model)
    db.session.commit()

    flash(f'项目 "{model_name}" 已删除', 'success')
    return redirect(url_for('main.index'))
