package com.proxy.dynamic.jdk.tx;

import lombok.Setter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

//事物的增强操作
@SuppressWarnings("all")
@Setter
public class TransactionManagerAdvice implements InvocationHandler {
    private Object target;
    private TransactionManger tx;
    public <T> T getProxyObject() {

        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), //类加载器，一般是真实对象的类加载器
                target.getClass().getInterfaces(), //真实对象所实现的接口(JDK动态加载必须要求对象有接口)
                this);//如何做事物增强的对象

    }

    //如何为真实对象的方法做增强的具体操作
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object ret = null;
        try {
            tx.begin();
            ret = method.invoke(target, args);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
        }

        return ret;
    }
}
