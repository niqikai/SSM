package com.di.autowired.xml;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig(locations = {"classpath:xml-autowired.xml"})
class PersonTest {

    @Autowired
    private Person person;

    @Test
    void test() {
        System.out.println(person);
    }

}