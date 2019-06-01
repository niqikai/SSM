package com.demo.springtest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;


// Junit5方式
@SpringJUnitConfig(locations = {"classpath:springtest.xml"})
class SomeBeanTest {
    @Autowired
    private SomeBean someBean;

    @Test
    void beanTest() {
        someBean.saySomeThing();
    }
}