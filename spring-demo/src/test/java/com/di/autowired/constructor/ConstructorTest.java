package com.di.autowired.constructor;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig(locations = {"classpath:constructor-autowired.xml"})
class ConstructorTest {

    @Autowired
    private Person person;


    @Test
    void test() {
        System.out.println(person);
    }


}