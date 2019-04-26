package com.zhaojun.hello.dubbo.provider.service;

import com.zhaojun.hello.dubbo.api.DemoService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author zhaojun0193
 * @date 2019/4/27
 */
@Service(version = "${demo.service.version}")
@Component
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHi() {
        return "Hello Dubbo!";
    }
}
