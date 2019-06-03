package com.proxy.staticproxy.dao.impl;

import com.proxy.staticproxy.dao.IEmployeeDao;
import com.proxy.staticproxy.domain.Employee;

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
