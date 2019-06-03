package com.proxy.dynamic.jdk.dao;

import com.proxy.dynamic.jdk.domain.Employee;

public interface IEmployeeDao {

    void save(Employee employee);
    void update(Employee employee);
}
