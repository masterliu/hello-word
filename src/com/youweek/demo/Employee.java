package com.youweek.demo;
import java.io.*;

public class Employee {
    String name;
    int age ;

    //int y = age;
    String designation;
    double salary;
    //构造器(Employee类的构造方法)
    public Employee(String name){
        this.name=name;
    }
    //设置 age值
    public void empAge(int empAge){
                                        age = empAge;
    }
    //设置 designation值
    public void empDesignation(String empDesig){
            designation = empDesig;
    }
    //设置 salary值
    public void empSalary(double empSalary){
        salary = empSalary;
    }

    public void printEmployee(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("designation:"+designation);
        System.out.println("salary:"+salary);
    }
}
