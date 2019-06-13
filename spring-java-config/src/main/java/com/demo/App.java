package com.demo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Hello world!
 *
 */
@Component
public class App 
{
//    @PostConstruct
    public void init() {
        System.out.println("init");
    }

    public App() {
        System.out.println("app...");
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
