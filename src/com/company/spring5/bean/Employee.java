package com.company.spring5.bean;

/**
 *  员工类
 * */
public class Employee {

    private String name;

    private String gender;

    public Department getDept() {
        return dept;
    }

    private Department dept;

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dept=" + dept.name +
                '}';
    }
}
