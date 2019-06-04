package com.aop.xml;

import com.aop.xml.domain.Employee;
import com.aop.xml.service.IEmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig(locations = {"classpath:xml-aop.xml"})
class AopXmlTest {
    @Autowired
    private IEmployeeService service;

    @Test
    void test() {
        System.out.println(service);
        service.save(new com.proxy.dynamic.jdk.domain.Employee());
    }

    @Test
    void test2() {
        service.update(new com.proxy.dynamic.jdk.domain.Employee());
    }
}