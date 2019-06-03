package com.proxy.staticproxy.proxy;

import com.proxy.staticproxy.domain.Employee;
import com.proxy.staticproxy.service.IEmployeeService;
import com.proxy.staticproxy.tx.TransactionManger;
import lombok.Setter;

@Setter
public class EmployeeServiceProxy implements IEmployeeService {

    private IEmployeeService target;

    private TransactionManger tx;
    @Override
    public void save(Employee employee) {
        tx.begin();
        try {
            target.save(employee);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
        }
    }

    @Override
    public void update(Employee employee) {
        try {
            target.update(employee);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
        }
    }
}
