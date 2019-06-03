package com.proxy.dynamic.jdk.dao.impl;

import com.proxy.dynamic.jdk.dao.IEmployeeDao;
import com.proxy.dynamic.jdk.domain.Employee;

public class EmployeeDaoImpl implements IEmployeeDao {

    @Override
    public void save(Employee employee) {
        System.out.println("save... ...");
    }

    @Override
    public void update(Employee employee) {
        System.out.println("update... ...");
    }
}
