package com.proxy.dynamic.jdk.service.impl;

import com.proxy.dynamic.jdk.dao.IEmployeeDao;
import com.proxy.dynamic.jdk.domain.Employee;
import com.proxy.dynamic.jdk.service.IEmployeeService;
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
