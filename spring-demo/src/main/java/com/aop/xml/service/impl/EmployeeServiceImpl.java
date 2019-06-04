package com.aop.xml.service.impl;

import com.aop.xml.dao.IEmployeeDao;
import com.aop.xml.service.IEmployeeService;

import com.proxy.dynamic.jdk.domain.Employee;
import lombok.Setter;

@Setter
public class EmployeeServiceImpl implements IEmployeeService {
    private IEmployeeDao dao;

    @Override
    public void save(Employee employee) {
        dao.save(employee);
    }

    @Override
    public void update(Employee employee) {
        dao.update(employee);
        int i = 1/0;
    }
}
