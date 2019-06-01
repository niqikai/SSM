package com.ioc.createbean;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = {"classpath:createbean.xml"})
class CatTest {
    @Autowired
    private Cat cat;

    @Autowired
    private Dog dog;
    @Autowired
    private Fish fish;

    @Autowired
    private Farmer farmer;


    @Test
    void testOld() {
        // 构造器
        Cat cat = new Cat();
        // 静态工厂
        Dog dog = DogFactory.createInstance();
        //  实例工厂
        Fish fish = new FishFactory().createInstance();
    }


    @Test
    void testNew() {
        System.out.println(cat);
        System.out.println(dog);
        System.out.println(fish);
        System.out.println(farmer);
    }
}