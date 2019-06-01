package com.ioc.lifecycle;

public class MyDataSource {
    public MyDataSource() {
        System.out.println("creating ... ...");
    }


    public void open() {
        System.out.println("opening ... ...");
    }

    public void close() {
        System.out.println("closing ... ...");
    }

    public void doWork() {
        System.out.println("working ... ...");
    }

}
