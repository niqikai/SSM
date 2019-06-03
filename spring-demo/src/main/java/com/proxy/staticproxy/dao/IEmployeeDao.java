package com.proxy.staticproxy.dao;

import com.proxy.staticproxy.domain.Employee;

public interface IEmployeeDao {

    void save(Employee employee);
    void update(Employee employee);
}
