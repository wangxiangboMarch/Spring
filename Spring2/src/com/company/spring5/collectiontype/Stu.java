package com.company.spring5.collectiontype;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {
    private String[] courses;

    private List<String> list;

    private List<Course> courseList;

    private Map<String, String> maps;

    private Set<String> sets;

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void test() {
        System.out.println(courses.toString());
        System.out.println(list.toString());
        System.out.println(maps.toString());
        System.out.println(sets .toString());
    }
}
/**
 *  IOC操作bean 管理生命周期
 *  生命周期就是从创建到销毁
 *
 *  1、创建bean
 *  2、为bean的属性填充值 和对其他bean的饮用
 *  3、调用bean的初始化方法
 *  4、bean 可以获取到了 （对象创建出来了 ）
 *  5、当容器关闭时候调用bean的销毁方法
 *
 * */