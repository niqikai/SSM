package com.ioc.hello;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

class HelloWorldTest {

    /**
     * 传统方式创建对象
     */
    @Test
    void testOld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setUsername("Adam");
        helloWorld.sayHello();
    }

    /**
     * 使用了Spring
     */
    @Test
    void testIoC() {
        HelloWorld world = null;
        //-------------
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        //签名一：根据bean对象在容器中的名称来获取
//        world = (HelloWorld) factory.getBean("hello");
        //签名二：按照指定类型寻找bean对象
//        world = factory.getBean(HelloWorld.class);
        //签名三：
        world = factory.getBean("hello", HelloWorld.class);
        //---------------

        world.sayHello();
    }

    /**
     * 模拟Spring Ioc 操作
     *
     */
    @Test
    void testIoCMock() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String className = "HelloWorld";
        HelloWorld world = null;
        Object object = Class.forName(className).newInstance();

        world = (HelloWorld)object;
        world.sayHello();
    }


}