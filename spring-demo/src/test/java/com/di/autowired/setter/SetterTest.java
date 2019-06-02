package com.di.autowired.setter;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig(locations = {"classpath:setter-autowired.xml"})
class SetterTest {
    @Autowired
    private Person person;

    @Test
    void test() {
        System.out.println(person);
    }



}