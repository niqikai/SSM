package com.proxy.dynamic.jdk;

import com.proxy.dynamic.jdk.domain.Employee;
import com.proxy.dynamic.jdk.service.IEmployeeService;
import com.proxy.dynamic.jdk.tx.TransactionManagerAdvice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig(locations = {"classpath:jdk-proxy.xml"})
class JDKProxyTest {

    @Autowired
    private TransactionManagerAdvice advice;

    @Test
    void test() {
        IEmployeeService proxy = advice.getProxyObject();

        proxy.save(new Employee());
    }

    @Test
    void test2() {
        IEmployeeService proxy = advice.getProxyObject();

        proxy.update(new Employee());
    }

}