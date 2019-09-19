package com.demo.mapper;

import com.demo.domain.User;

import java.util.List;

public interface UserMapper {
    void save( User user);

    void update( User user );

    void delete(Integer id);

    User get( Integer id);

    List<User> listAll();
}
