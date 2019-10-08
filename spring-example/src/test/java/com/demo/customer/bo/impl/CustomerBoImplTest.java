package com.demo.customer.bo.impl;

import com.demo.aop.customer.CustomerService;
import com.demo.customer.bo.CustomerBo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class CustomerBoImplTest {

    @Test
    public void test() {
        ApplicationContext appContext =
                new ClassPathXmlApplicationContext( new String[] { "Spring-Module.xml" });

        CustomerBo customer = (CustomerBo) appContext.getBean("customerBo");
        customer.addCustomer();


    }

}