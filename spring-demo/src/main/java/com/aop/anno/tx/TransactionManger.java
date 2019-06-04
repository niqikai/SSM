package com.aop.anno.tx;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//模拟事物管理器
@Component
@Aspect
public class TransactionManger {

    @Pointcut("execution(* com.aop.anno.service.*Service.*(..))")
    public void txPoint() {

    }

    @Before("txPoint()")
    public void begin(JoinPoint jp) {
        System.out.println("开启事物");
    }

    public void commit(JoinPoint jp) {
        System.out.println("提交事物");
    }

    public void rollback(JoinPoint jp) {
        System.out.println("回滚事物");
    }
}
