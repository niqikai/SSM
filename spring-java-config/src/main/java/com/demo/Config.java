package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan
@ImportResource(locations = {"classpath:applicationContext.xml"})
@PropertySource("classpath:db.properties")

public class Config {


//    @Value("${db.username}")
//    private String username;
//    @Value("${db.age}")
//    private String age;


    @Autowired
    private Environment env;
    public DataSource dataSource() {
        return new DataSource(env.getProperty("db.username"), env.getProperty("db.age"));
    }

    // 方法名字就是 bean id
    @Bean(initMethod = "init")
    public App app() {
        return new App();
    }

//    @Bean
//    public DataSource dataSource() {
//        return new DataSource(username, age);
//    }

//    @Bean
//    public static PropertyPlaceholderConfigurer propertyPlaceholderConfigurer() {
//        return new PropertyPlaceholderConfigurer();
//    }


}
