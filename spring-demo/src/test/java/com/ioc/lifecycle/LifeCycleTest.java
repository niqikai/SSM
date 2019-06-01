package com.ioc.lifecycle;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = {"classpath:lifecycle.xml"})
class LifeCycleTest {

    @Autowired
    private MyDataSource ds;

    @Test
    void testOld() {
        MyDataSource ds = new MyDataSource();
        //初始化操作
        ds.open();
        ds.doWork();
        //扫尾操作
        ds.close();
    }



    @Test
    void testNew() {
        ds.doWork();
    }


}