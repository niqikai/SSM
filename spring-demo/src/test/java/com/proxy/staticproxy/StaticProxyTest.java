package com.proxy.staticproxy;

import com.proxy.staticproxy.domain.Employee;
import com.proxy.staticproxy.service.IEmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;
@SpringJUnitConfig(locations = {"classpath:static-proxy.xml"})
class StaticProxyTest {
    @Autowired
    private IEmployeeService service;

    @Test
    void save( ) {
        // 查看对象真实类型
        System.out.println(service.getClass());
        service.save(new Employee() );
    }

    @Test
    void update() {
        service.update(new Employee());
    }
}