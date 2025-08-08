package com.basiclab.iot.dataset.enums.dataset;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 数据帧类型枚举
 */
@Getter
@AllArgsConstructor
public enum DatasetFrameType {

    /**
     * 实时流帧捕获
     */
    LIVE_VIDEO_FRAME(0, "LIVE_VIDEO_FRAME"),

    /**
     * GB28181流帧捕获
     */
    GB28181_VIDEO_FRAME(1, "GB28181_VIDEO_FRAME");

    private Integer key;
    private String value;

}
