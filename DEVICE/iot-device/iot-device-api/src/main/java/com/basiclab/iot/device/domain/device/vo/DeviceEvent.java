package com.basiclab.iot.device.domain.device.vo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 设备动作数据
 *
 * @author EasyAIoT
 */
@ApiModel(value = "设备动作数据")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@Accessors(chain = true)
@Builder
public class DeviceEvent implements Serializable {
    /**
     * id
     */
    @ApiModelProperty(value = "id")
    private Long id;

    /**
     * 设备标识
     */
    @ApiModelProperty(value = "设备标识")
    private String deviceIdentification;

    /**
     * 事件名称
     */
    @ApiModelProperty(value = "事件名称")
    private String eventName;

    /**
     * 事件标识符
     */
    @ApiModelProperty(value = "事件标识符")
    private String eventCode;

    /**
     * 动作类型
     */
    @ApiModelProperty(value = "事件类型")
    private String eventType;

    /**
     * 状态
     */
    @ApiModelProperty(value = "状态")
    private String status;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 内容信息
     */
    @ApiModelProperty(value = "内容信息")
    private String message;

    private static final long serialVersionUID = 1L;
}