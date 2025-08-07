package com.basiclab.iot.system.enums.oauth2;

import cn.hutool.core.util.ArrayUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * OAuth2 授权类型（模式）的枚举
 *
 * @author 深圳市深度智核科技有限责任公司
 */
@AllArgsConstructor
@Getter
public enum OAuth2GrantTypeEnum {

    PASSWORD("password"), // 密码模式
    AUTHORIZATION_CODE("authorization_code"), // 授权码模式
    IMPLICIT("implicit"), // 简化模式
    CLIENT_CREDENTIALS("client_credentials"), // 客户端模式
    REFRESH_TOKEN("refresh_token"), // 刷新模式
    ;

    private final String grantType;

    public static OAuth2GrantTypeEnum getByGranType(String grantType) {
        return ArrayUtil.firstMatch(o -> o.getGrantType().equals(grantType), values());
    }

}
