package com.basiclab.iot.device.hooks;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Map;

/**
 * @author IoT
 * @description
 * @date 2024/6/14
 */
@Setter
@Getter
@ToString
public class SubscribeHook extends BaseHook implements Serializable {

    /**
     * 将订阅的主题
     */
    private String topic;

    /**
     * 订阅参数
     */
    private String opts;

    public SubscribeHook(Map<String, Object> map){
        super(map);
        this.setEvent((String) map.get("action"));
        this.setClientId((String) map.get("clientid"));
        this.setUsername((String) map.get("username"));
        this.setTopic((String) map.get("topic"));
        this.setOpts((String) map.get("topic"));
    }
}
