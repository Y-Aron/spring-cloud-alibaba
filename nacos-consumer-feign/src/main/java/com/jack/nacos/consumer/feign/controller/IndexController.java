package com.jack.nacos.consumer.feign.controller;

import com.jack.nacos.consumer.feign.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: jack
 * @create: 2019/11/18 0:45
 * @version: 1.0.0
 **/
@RestController
public class IndexController {
    @Autowired
    private EchoService echoService;

    @GetMapping(value = "/echo/hi")
    public String echo() {
        return echoService.echo("Hi Feign");
    }
}
