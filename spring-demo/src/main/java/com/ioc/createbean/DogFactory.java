package com.ioc.createbean;

/**
 * 静态工厂方法
 */
public class DogFactory {
    public static Dog createInstance() {
        System.out.println(" in static factory");
        Dog dog = new Dog();

        return dog;
    }
}
