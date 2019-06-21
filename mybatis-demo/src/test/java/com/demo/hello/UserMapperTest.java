package com.demo.hello;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;


public class UserMapperTest {

    private static Logger logger = Logger.getLogger(UserMapperTest.class);


    @Test
    public void getTest() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = factory.openSession();
        User user = sqlSession.selectOne("com.demo.hello.UserMapper.get",1);
        sqlSession.close();
        System.out.println(user);
    }







}