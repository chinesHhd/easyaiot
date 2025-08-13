package com.basiclab.iot.device.domain.device.oo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.InputStream;

/**
 * @author EasyAIoT
 * @desc
 * @created 2025-06-03
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OssUploadOo {
    private String ossKey;
    private String fileName;
    private InputStream inputStream;
}