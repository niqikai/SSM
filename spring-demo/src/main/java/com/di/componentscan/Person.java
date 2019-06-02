package com.di.componentscan;

import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@ToString
@Setter
@Component
public class Person {
    @Autowired
    private Dog dog;

}
