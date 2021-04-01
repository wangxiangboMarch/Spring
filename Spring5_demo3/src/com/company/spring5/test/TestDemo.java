package com.company.spring5.test;

import com.company.spring5.config.SpringConfig;
import com.company.spring5.server.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

    @Test
    public void testUserService() {
        // 介于 xml 配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        UserService service = context.getBean("userService", UserService.class);

        service.add();

    }

    @Test
    public void testUserService1() {
        // 完全注解
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        UserService service = context.getBean("userService", UserService.class);

        service.add();

    }
}
