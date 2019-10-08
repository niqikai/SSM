package com.demo.ConfigExample.hello.impl;

import com.demo.ConfigExample.hello.HelloWorld;

public class HelloWorldImpl implements HelloWorld {
    @Override
    public void printHelloWorld(String msg) {
        System.out.println("Hello: " +msg);
    }
}
