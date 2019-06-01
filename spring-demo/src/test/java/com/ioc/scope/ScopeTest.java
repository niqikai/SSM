package com.ioc.scope;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = {"classpath:scope.xml"})
class ScopeTest {
    @Autowired
    private Dog dog1;

    @Autowired
    private Dog dog2;
    @Autowired
    private Dog dog3;


    @Test
    void test() {
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
    }

}