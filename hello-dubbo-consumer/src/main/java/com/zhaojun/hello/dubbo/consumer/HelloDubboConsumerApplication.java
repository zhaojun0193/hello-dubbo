package com.zhaojun.hello.dubbo.consumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhaojun0193
 * @date 2019/4/27
 */

@SpringBootApplication
public class HelloDubboConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloDubboConsumerApplication.class, args);
    }
}

