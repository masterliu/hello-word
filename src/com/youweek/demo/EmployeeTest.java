package com.youweek.demo;

import java.io.*;

public class EmployeeTest {
    public static void main(String args[]){
        //构建器创建两个对象
        Employee empOne = new Employee("RUNOOB1");
        Employee empTwo = new Employee("RUNOOB2");

        //调用两个对象的成员方法
        empOne.empAge(26);
        empOne.empDesignation("高级程序员");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(22);
        empTwo.empDesignation("初级程序员");
        empTwo.empSalary(500);
        empTwo.printEmployee();
    }
}
