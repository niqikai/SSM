package com.demo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = {DataSourceConfig.class, Config.class})
@ContextConfiguration(classes = AppConfig.class)
public class AppTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }


    @Test
    public void test() {
        ApplicationContext cxt = new AnnotationConfigApplicationContext(Config.class);
        App app = cxt.getBean("app",App.class);
        System.out.println(app);

    }


}
