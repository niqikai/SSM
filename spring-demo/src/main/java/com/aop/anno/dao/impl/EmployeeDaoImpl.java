package com.aop.anno.dao.impl;

import com.aop.anno.dao.IEmployeeDao;
import com.proxy.dynamic.jdk.domain.Employee;
import org.springframework.stereotype.Repository;

@Repository
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
