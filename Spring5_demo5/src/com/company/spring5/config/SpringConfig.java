package com.company.spring5.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration //座位配置类
@ComponentScan(basePackages = "com.company") // 替代配置文件 配置文件可以删掉了
@EnableAspectJAutoProxy
public class SpringConfig {

}
