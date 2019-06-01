package com.ioc.container;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

class PersonTest {

    /**
     * use beanFactory
     * beanFactory 延时初始化，不会立马去创建容器中管理的bean对象，
     * 而是等到从容器中获取对象到时候，才去创建对象
     */
    @Test
    void beanFactoryTest() {

        Resource resource = new ClassPathResource("container.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        System.out.println("----------------------------------");
        Person p = factory.getBean("person", Person.class);
        System.out.println(p);
    }


    /**
     * use applicationContext
     * 在创建容器到时候就会把容器中管理到bean立马初始化
     */
    @Test
    void applicationContextTest() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("container.xml");
        System.out.println("----------------------------------");
        Person p = ctx.getBean("person", Person.class);
        System.out.println(p);
    }

}