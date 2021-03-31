package com.company.spring5.test;

import com.company.spring5.Book;
import com.company.spring5.Orders;
import com.company.spring5.User;
import org.junit.Test;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestUser {
    @Test
    public void testAdd() {

        // 加载spring 配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        // 获取配置的对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();

        Book book = context.getBean("book", Book.class);
        book.testBook();

        Orders orders = context.getBean("orders", Orders.class);
        orders.testOrders();

        /**
         *  IOC 基于容器完成； 容器的底层就是工厂模式
         *
         *  两个接口：
         *  BeanFactory :内部接口， 加载配置文件的时候他不会创建对象，只有在获取和使用的时候才创建对象
         *
         *  ApplicationContext : BeanFactory的子类， 加载配置文件就开始创建
         *  主要实现：
         *  ClassPathXmlApplicationContext ： 类路径
         *  FileSystemXmlApplicationContext : 盘里面的路径
         *  web： 一般在服务器启动的时候完成创建最好， 所以一半使用第二种
         * */
    }
}
