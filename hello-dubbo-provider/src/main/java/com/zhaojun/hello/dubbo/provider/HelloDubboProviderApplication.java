package com.zhaojun.hello.dubbo.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhaojun0193
 * @date 2019/4/27
 */

@EnableDubbo
@SpringBootApplication
public class HelloDubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloDubboProviderApplication.class, args);
    }

}
