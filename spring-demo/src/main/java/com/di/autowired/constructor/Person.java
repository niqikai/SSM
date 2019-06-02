package com.di.autowired.constructor;

import lombok.Setter;
import lombok.ToString;

@ToString

public class Person {
    private Dog dog;

    public Person(Dog dog) {
        this.dog = dog;
    }
}
