package com.basiclab.iot.device;


import com.basiclab.iot.common.constant.ServiceNameConstants;
import com.basiclab.iot.common.domain.R;
import com.basiclab.iot.device.factory.RemoteProductCommandsFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@FeignClient(contextId = "remoteProductCommandsService", value = ServiceNameConstants.IOT_DEVICE, fallbackFactory = RemoteProductCommandsFallbackFactory.class)
public interface RemoteProductCommandsService {

    @PostMapping ("/productCommands/selectProductCommandsByIdList")
    R<?> selectProductCommandsByIdList(@RequestBody List<Long> commandIdList);

    @GetMapping("/productCommands/selectAllCommandsByServiceId/{serviceId}")
    R<?> selectAllByServiceId(@RequestParam("serviceId") Long serviceId);

}
