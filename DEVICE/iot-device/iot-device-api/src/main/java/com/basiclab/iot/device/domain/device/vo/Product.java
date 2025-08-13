package com.basiclab.iot.device.domain.device.vo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;
/**
 * 产品模型
 * @author EasyAIoT
 */
@ApiModel(value = "产品模型")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@Accessors(chain = true)
@Builder
public class Product implements Serializable {
    /**
     * id
     */
    @ApiModelProperty(value = "id")
    private Long id;

    /**
     * 应用ID
     */
    @ApiModelProperty(value = "应用ID")
    private String appId;

    /**
     * 产品模版标识
     */
    @ApiModelProperty(value = "产品模版标识")
    private String templateIdentification;

    /**
     * 产品名称:自定义，支持中文、英文大小写、数字、下划线和中划线
     */
    @ApiModelProperty(value = "产品名称:自定义，支持中文、英文大小写、数字、下划线和中划线")
    private String productName;

    /**
     * 产品标识
     */
    @ApiModelProperty(value = "产品标识")
    private String productIdentification;

    /**
     * 支持以下两种产品类型•COMMON：普通产品，需直连设备。
     * •GATEWAY：网关产品，可挂载子设备。
     */
    @ApiModelProperty(value = "支持以下两种产品类型•COMMON：普通产品，需直连设备。,•GATEWAY：网关产品，可挂载子设备。,•SUBSET：子设备。")
    private String productType;

    /**
     * 厂商ID:支持英文大小写，数字，下划线和中划线
     */
    @ApiModelProperty(value = "厂商ID:支持英文大小写，数字，下划线和中划线")
    private String manufacturerId;

    /**
     * 厂商名称 :支持中文、英文大小写、数字、下划线和中划线
     */
    @ApiModelProperty(value = "厂商名称 :支持中文、英文大小写、数字、下划线和中划线")
    private String manufacturerName;

    /**
     * 产品型号，建议包含字母或数字来保证可扩展性。支持英文大小写、数字、下划线和中划线
     */
    @ApiModelProperty(value = "产品型号，建议包含字母或数字来保证可扩展性。支持英文大小写、数字、下划线和中划线,")
    private String model;

    /**
     * 数据格式，默认为JSON无需修改。
     */
    @ApiModelProperty(value = "数据格式，默认为JSON无需修改。")
    private String dataFormat;

    /**
     * 设备类型:支持英文大小写、数字、下划线和中划线
     */
    @ApiModelProperty(value = "设备类型:支持英文大小写、数字、下划线和中划线,")
    private String deviceType;

    /**
     * 设备接入平台的协议类型，默认为MQTT无需修改。
     */
    @ApiModelProperty(value = "设备接入平台的协议类型，默认为MQTT无需修改。, ")
    private String protocolType;


    /**
     * 认证方式
     */
    @ApiModelProperty("认证方式")
    private String authMode;

    /**
     * 用户名
     */
    @ApiModelProperty("用户名")
    private String userName;

    /**
     * 密码
     */
    @ApiModelProperty("密码")
    private String password;

    /**
     * 连接实例
     */
    @ApiModelProperty("连接实例")
    private String connector;

    /**
     * 签名密钥
     */
    @ApiModelProperty("签名密钥")
    private String signKey;

    /**
     * 协议加密方式 0：不加密 1：SM4加密 2：AES加密
     */
    @ApiModelProperty("协议加密方式")
    private Integer encryptMethod;

    /**
     * 状态(字典值：0启用  1停用)
     */
    @ApiModelProperty(value = "状态(字典值：0启用  1停用)")
    private String status;

    /**
     * 产品描述
     */
    @ApiModelProperty(value = "产品描述")
    private String remark;

    /**
     * 创建者
     */
    @ApiModelProperty(value = "创建者")
    @TableField(value = "create_by", fill = FieldFill.INSERT)
    private String createBy;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    /**
     * 更新者
     */
    @ApiModelProperty(value = "更新者")
    @TableField(value = "update_by", fill = FieldFill.INSERT_UPDATE)
    private String updateBy;

    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "加密密钥")
    private String encryptKey;

    @ApiModelProperty(value = "加密向量")
    private String encryptVector;

    private static final long serialVersionUID = 1L;


    public static enum productTypeEnum{
        /**
         * 网关
         */
        GATEWAY("GATEWAY"),
        /**
         * 普通设备
         */
        COMMON("COMMON"),
        /**
         * 子设备
         */
        SUBSET("SUBSET")
        ;

        private String type;

        productTypeEnum(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }
}