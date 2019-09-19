package com.demo.hello;

import com.demo.utils.MyBatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class UserMapperTest {

    private static Logger logger = Logger.getLogger(UserMapperTest.class);


    @Test
    public void getTest() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = factory.openSession();
        User user = sqlSession.selectOne("com.demo.hello.UserMapper.get",2);
        sqlSession.close();
        System.out.println(user);
    }


    @Test
    public void listAll() throws IOException {
        SqlSession sqlSession = MyBatisUtil.getFactory();
        List<User> users = sqlSession.selectList("com.demo.hello.UserMapper.listAll");
        sqlSession.close();
        System.out.println(users);
    }

    @Test
    public void testUpdate() throws IOException {
        User user = new User();
        user.setAge(35);
        user.setId(2);
        user.setName("update");
        SqlSession sqlSession = MyBatisUtil.getFactory();
        sqlSession.update("com.demo.hello.UserMapper.update", user);
        sqlSession.commit();
        sqlSession.close();
//        System.out.println(users);
    }



}