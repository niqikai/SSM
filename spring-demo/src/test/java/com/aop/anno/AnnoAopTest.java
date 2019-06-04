package com.aop.anno;

import com.aop.anno.service.IEmployeeService;
import com.proxy.dynamic.jdk.domain.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig(locations = {"classpath:anno-aop.xml"})
class AnnoAopTest {

    @Autowired
    IEmployeeService service;
    @Test
    void test() {
        service.save(new Employee());
    }
}