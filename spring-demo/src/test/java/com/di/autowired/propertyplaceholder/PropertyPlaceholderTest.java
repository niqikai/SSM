package com.di.autowired.propertyplaceholder;

import com.alibaba.druid.pool.DruidDataSource;
import com.mysql.cj.protocol.Resultset;
import lombok.Cleanup;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import javax.sql.DataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig(locations = {"classpath:property-placeholder.xml"})
class PropertyPlaceholderTest {
    @Autowired
    private DruidDataSource ds;

    @Test
    void test() throws Exception{

//        ds = new DruidDataSource();
//        ds.setDriverClassName("com.mysql.jdbc.Driver");
//        ds.setUrl("jdbc:mysql://127.0.0.1:3306/learnsql");
//        ds.setUsername("root");
//        ds.setPassword("root");
//        ds.setInitialSize(2);

        @Cleanup
        Connection conn = ds.getConnection();
        @Cleanup
        PreparedStatement ps = conn.prepareStatement("select * from t_student");
        @Cleanup
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString("id"));
        }
    }


}