package com.example.serviceclient5.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope  //@RefreshScope这个是springcloud bus 消息总线  注解   加控制器上 不能加启动类上
public class HiController {

    @Value("${server.port}")
    String port;
    @Value("${tzj}")
    String tzj;
    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "hi " + name + " ,i am from port:" + port+",config="+tzj;
    }
}
