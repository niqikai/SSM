package com.demo.container;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig(locations = {"classpath:container.xml"})
class Person2Test {

    @Autowired
    private Person person;

    @Test
    void test() {
        System.out.println(person);
    }
}