package com.basiclab.iot.device.enums;

import com.basiclab.iot.common.enums.RpcConstants;

/**
 * API 相关的枚举
 *
 * @author 深圳市深度智核科技有限责任公司
 */
public class ApiConstants {

    /**
     * 服务名
     *
     * 注意，需要保证和 spring.application.name 保持一致
     */
    public static final String NAME = "device-server";

    public static final String PREFIX = RpcConstants.RPC_API_PREFIX + "/device";

    public static final String VERSION = "1.0.0";

}
