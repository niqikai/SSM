package com.demo;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException {

        System.out.println( "Hello World!" );

        // 1. 加载注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        // 2. 获取连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnsql", "root", "root");
        // 3. 创建语句对象
        Statement st = connection.createStatement();
        // 4. 执行SQL语句
        ResultSet set = st.executeQuery("SELECT * FROM t_student");
        while (set.next()) {
            System.out.println(set.getString("name"));
        }
        // 5. 释放资源
        st.close();
        connection.close();

    }
}
