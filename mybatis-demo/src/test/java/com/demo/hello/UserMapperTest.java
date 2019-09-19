package com.demo.hello;

import com.demo.client.mapper.ClientMapper;
import com.demo.domain.LoginVO;
import com.demo.mapper.UserMapper;
import com.demo.utils.MyBatisUtil;
import com.mysql.cj.Session;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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

    @Test
    public void testInterface() {
        SqlSession sqlSession = MyBatisUtil.getFactory();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        com.demo.domain.User user = userMapper.get(2);
        sqlSession.close();
        System.out.println(user);
    }

    @Test
    public void testLogin() {
        LoginVO loginVO = new LoginVO("update", 18);
        SqlSession sqlSession = MyBatisUtil.getFactory();
        ClientMapper clientMapper = sqlSession.getMapper(ClientMapper.class);
        System.out.println(clientMapper.login1(loginVO));
        sqlSession.close();

    }



    @Test
    public void testLogin2() {

        Map<String, Object> map = new HashMap<String, Object>() {
            {
                this.put("name", "update");
                this.put("age", 18);
            }
        };
        LoginVO loginVO = new LoginVO("update", 18);
        SqlSession sqlSession = MyBatisUtil.getFactory();
        ClientMapper clientMapper = sqlSession.getMapper(ClientMapper.class);
        System.out.println(clientMapper.login2(map));
        sqlSession.close();

    }


    @Test
    public void testLogin3() {

        LoginVO loginVO = new LoginVO("update", 18);
        SqlSession sqlSession = MyBatisUtil.getFactory();
        ClientMapper clientMapper = sqlSession.getMapper(ClientMapper.class);
        System.out.println(clientMapper.login3("update", 18));
        sqlSession.close();

    }
}