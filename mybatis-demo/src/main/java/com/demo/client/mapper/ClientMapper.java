package com.demo.client.mapper;

import com.demo.domain.Client;
import com.demo.domain.LoginVO;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface ClientMapper {
    Client login1(LoginVO vo);
    Client login2(Map<String, Object> map);

    Client login3(@Param("name") String name, @Param("age") int age);
}
