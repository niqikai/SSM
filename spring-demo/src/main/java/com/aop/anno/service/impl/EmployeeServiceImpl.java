package com.aop.anno.service.impl;

import com.aop.anno.dao.IEmployeeDao;
import com.aop.anno.service.IEmployeeService;
import com.proxy.dynamic.jdk.domain.Employee;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Setter
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
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
