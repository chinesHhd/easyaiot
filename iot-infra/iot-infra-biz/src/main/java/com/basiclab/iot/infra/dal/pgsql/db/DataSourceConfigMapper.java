package com.basiclab.iot.infra.dal.pgsql.db;

import com.basiclab.iot.common.core.mapper.BaseMapperX;
import com.basiclab.iot.infra.dal.dataobject.db.DataSourceConfigDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 数据源配置 Mapper
 *
 * @author IoT
 */
@Mapper
public interface DataSourceConfigMapper extends BaseMapperX<DataSourceConfigDO> {
}
