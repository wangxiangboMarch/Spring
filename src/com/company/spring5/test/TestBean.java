package com.company.spring5.test;

import com.company.spring5.bean.Employee;
import com.company.spring5.server.UserServer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    @Test
    public void testAdd() {
        // 加载spring 配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        UserServer server = context.getBean("userServer", UserServer.class);

        server.add();

    }

    @Test
    public void testEmployee() {
        // 加载spring 配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");

        Employee emp = context.getBean("emp", Employee.class);

        System.out.println(emp.toString());
    }

}
