package com.company.spring5;

public class User {

    private String name;

    public void add() {
        System.out.println("add ....");
    }
}

/**
 *  Bean 管理操作有两种方式
 *  xml 配置文件 创建对象、注入属性
 *
 *  bean标签种的常见属性
 *  id： 标识符
 *  class： 类的全路径
 *  name： 和id是一样的；区别是 id 中不能使用特殊符号
 *
 *  创建对象的时候默认调用无参的构造函数，完成对象的创建
 *
 *  基于xml 方式注入属性：
 *  DI： 依赖注入
 *  DI 是IOC中的一种具体实现
 *
 * */
