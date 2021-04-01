package com.company.spring5.server;

import com.company.spring5.dao.UserDao;

public class UserServer {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("server add ......");
        userDao.update();
    }
}
