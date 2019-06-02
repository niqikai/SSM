package com.di.autowired.inheritance;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig(locations = {"classpath:inheritance-autowired.xml"})
class InheritanceTest {

    @Autowired
    private BeanOne one;

    @Autowired
    private BeanTwo two;

    @Test
    void test() {
        System.out.println(one);
        System.out.println(two);
    }
}