package com.company.spring5.server;

import com.company.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;



/// 在注解中 value 相当于xml 里面的id 值 ；值可以不写 默认就是类名 首字母小写
//@Component(value = "userService")
//@Service
//@Controller
@Repository
public class UserService {
    /**
     *  根据类型注入
     *  不需要写set方法
     * */
    @Autowired
    /**
     *  Qualifier 要和 Autowired一起使用
     *  根据属性名称注入： 指定名称
     * */
    @Qualifier(value = "userDaoImp")
    private UserDao userDao;

//    @Resource() 不建议使用 java11 中用不了
//    private UserDao userDao1;

    @Value(value = "hello")
    private String name;

    public void add() {
        System.out.println("user service add ..." + name);
        userDao.add();
    }
}
