package com.demo.createbean;

//实例工厂
public class FishFactory {

    public Fish createInstance() {
        System.out.println("in instance factory");
        Fish fish = new Fish();

        return fish;
    }
}
