package com.demo.output;

import com.demo.output.impl.CsvOutputGenerator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

class OutputHelper
{
    private IOutputGenerator outputGenerator;

    public OutputHelper(){
        outputGenerator = new CsvOutputGenerator();
    }

    public void generateOutput(){
        outputGenerator.generatorOutput();
    }

}
public class IOutputGeneratorTest {

    // Call it directly
    @Test
    public void test() {
        IOutputGenerator output = new CsvOutputGenerator();
        output.generatorOutput();
    }

    // Call it with helper class
    @Test
    public void test2() {
        OutputHelper output = new OutputHelper();
        output.generateOutput();
    }


    // Spring
    @Test
    public void test3() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext( new String[] {"Spring-Module.xml"});
        SpringOutputHelper outputHelper = (SpringOutputHelper) context.getBean("outPutHelper");
        outputHelper.generateOutput();
    }

}

