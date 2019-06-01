package com.demo.springtest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.runner.RunWith;

//Spring Junit4

@RunWith(SpringJUnit4ClassRunner.class)
//
@ContextConfiguration(locations = {
        "classpath:springtest.xml"
})
public class SpringTestTest {

    @Autowired
    private SomeBean someBean;

    @Test
    public void testIoC() {
        someBean.saySomeThing();
    }

}
