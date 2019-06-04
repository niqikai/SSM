package com.aop.xml.service;

import com.proxy.dynamic.jdk.domain.Employee;

public interface IEmployeeService {
    void save(Employee employee);
    void update(Employee employee);
}
