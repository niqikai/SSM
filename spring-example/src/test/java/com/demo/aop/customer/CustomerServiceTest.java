package com.demo.aop.customer;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class CustomerServiceTest {

    @Test
    public void test() {
        ApplicationContext appContext =
                new ClassPathXmlApplicationContext( new String[] { "Spring-Module.xml" });

//        CustomerService cust = (CustomerService) appContext.getBean("customerService");
//        CustomerService cust = (CustomerService) appContext.getBean("customerServiceProxy");
        CustomerService cust = (CustomerService) appContext.getBean("customerServiceProxy2");

        System.out.println("*************************");
        cust.printName();
        System.out.println("*************************");
        cust.printURL();
        System.out.println("*************************");
        try {
            cust.printThrowException();
        } catch (Exception e) {

        }
    }

}