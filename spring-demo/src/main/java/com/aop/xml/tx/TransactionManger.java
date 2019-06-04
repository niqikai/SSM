package com.aop.xml.tx;

//模拟事物管理器
public class TransactionManger {

    public void begin() {
        System.out.println("开启事物");
    }

    public void commit() {
        System.out.println("提交事物");
    }

    public void rollback() {
        System.out.println("回滚事物");
    }
}
