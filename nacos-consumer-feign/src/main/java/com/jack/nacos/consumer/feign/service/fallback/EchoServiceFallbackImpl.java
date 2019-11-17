package com.jack.nacos.consumer.feign.service.fallback;

import com.jack.nacos.consumer.feign.service.EchoService;
import org.springframework.stereotype.Component;

/**
 * @author: jack
 * @create: 2019/11/18 1:07
 * @version: 1.0.0
 **/
@Component
public class EchoServiceFallbackImpl implements EchoService {

    @Override
    public String echo(String message) {
        return "echo fallback";
    }
}