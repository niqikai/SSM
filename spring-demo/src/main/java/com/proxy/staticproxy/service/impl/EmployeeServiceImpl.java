package com.proxy.staticproxy.service.impl;

import com.proxy.staticproxy.dao.IEmployeeDao;
import com.proxy.staticproxy.domain.Employee;
import com.proxy.staticproxy.service.IEmployeeService;
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
