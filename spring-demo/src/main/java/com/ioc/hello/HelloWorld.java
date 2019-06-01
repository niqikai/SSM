package com.ioc.hello;

import lombok.Setter;

@Setter
public class HelloWorld {
    private String username;

    public void sayHello() {
        System.out.println("Hello Spring ... ..." + username);
    }

}
