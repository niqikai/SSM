package com.demo.ConfigExample.core;

import com.demo.ConfigExample.config.AppConfig;
import com.demo.ConfigExample.hello.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld obj = (HelloWorld) context.getBean("hello");
        obj.printHelloWorld("Spring Java Config");

        CustomerBo customer = (CustomerBo) context.getBean("customer");
        customer.printMsg("Hello 1");

        SchedulerBo scheduler = (SchedulerBo) context.getBean("scheduler");
        scheduler.printMsg("Hello 2");
    }
}
