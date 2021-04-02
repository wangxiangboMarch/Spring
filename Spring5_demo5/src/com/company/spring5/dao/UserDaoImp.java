package com.company.spring5.dao;

import org.springframework.stereotype.Controller;

@Controller
public class UserDaoImp implements UserDao {

    @Override
    public void add() {
        System.out.println("user dao add ....");
    }
}
