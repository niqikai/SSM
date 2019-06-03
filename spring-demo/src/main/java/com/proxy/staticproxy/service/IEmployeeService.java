package com.proxy.staticproxy.service;

import com.proxy.staticproxy.domain.Employee;

public interface IEmployeeService {
    void save(Employee employee);
    void update(Employee employee);
}
