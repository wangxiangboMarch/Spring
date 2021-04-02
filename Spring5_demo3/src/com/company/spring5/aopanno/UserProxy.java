package com.company.spring5.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

// 增强类
@Component
@Aspect // 生成对象
public class UserProxy {

    //抽取相同的切入点
    @Pointcut(value = "execution(* com.company.spring5.aopanno.User.add(..))")
    public void pointDemo() {

    }

     /// 前置通知 配置通知类型
     @Before(value = "pointDemo()")
     public void before() {
         System.out.println("before .....");
     }

     @After(value = "pointDemo()")
     public void after() {
         System.out.println("after ....");
     }

    @AfterThrowing(value = "pointDemo()")
    public void afterThrowing() {
        System.out.println("AfterThrowing ....");
    }
    // 返回通知
    @AfterReturning(value = "pointDemo()")
    public void afterReturning() throws Throwable {
        System.out.println("AfterReturning  ....");
    }
    // 环绕 在方法之前之后都会执行
    @Around(value = "pointDemo()")
    public void around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("around pre ....");
        point.proceed();
        System.out.println("around nest ....");
    }
}
