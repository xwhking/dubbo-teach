package com.xwhking.dubbo_consumer;

import com.xwhking.dubbo_interface.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @DubboReference
    private HelloService helloService;
    @GetMapping("/hello")
    public String hello(String name) {
        String result = helloService.sayHello(name);
        return result;
    }
}
