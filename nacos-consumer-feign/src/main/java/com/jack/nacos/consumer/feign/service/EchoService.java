package com.jack.nacos.consumer.feign.service;

import com.jack.nacos.consumer.feign.service.fallback.EchoServiceFallbackImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author: jack
 * @create: 2019/11/18 0:43
 * @version: 1.0.0
 **/
@FeignClient(value = "nacos-provider", fallback = EchoServiceFallbackImpl.class)
public interface EchoService {

    @GetMapping(value = "/echo/{message}")
    String echo(@PathVariable("message") String message);
}