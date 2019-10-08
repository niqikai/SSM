package com.demo.ConfigExample.config;

import com.demo.ConfigExample.hello.HelloWorld;
import com.demo.ConfigExample.hello.impl.HelloWorldImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({CustomerConfig.class, SchedulerConfig.class})
public class AppConfig {

    @Bean(name = "hello")
    public HelloWorld helloWorld() {
        return new HelloWorldImpl();
    }
}
