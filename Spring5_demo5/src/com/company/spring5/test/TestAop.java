package com.company.spring5.test;

import com.company.spring5.aopanno.User;
import com.company.spring5.config.SpringConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {

    @Test
    public void testAnno() {
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        User use = context.getBean("user", User.class);

        use.add();
    }

}
