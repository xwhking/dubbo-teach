package com.xwhking.dubbo_provider;

import com.xwhking.dubbo_interface.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name + "\n This is Dubbo";
    }
}
