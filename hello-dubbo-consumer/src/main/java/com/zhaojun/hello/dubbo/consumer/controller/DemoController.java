package com.zhaojun.hello.dubbo.consumer.controller;

import com.zhaojun.hello.dubbo.api.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaojun0193
 * @date 2019/4/27
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Reference(version = "${demo.service.version}")
    private DemoService demoService;

    @RequestMapping(value = "/sayHi",method = RequestMethod.GET)
    public String sayHi(){
        return demoService.sayHi();
    }
}
