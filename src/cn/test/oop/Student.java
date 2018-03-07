package cn.test.oop;

public class Student {
    //静态的数据
    String name;
    int id;
    int age;
    String gender;
    int weight;
    static int ss;

    //静态方法,从属于类
    //不能调用非静态的内容
    public static void printss(){
        System.out.println(ss);
    }

    //动态的行为
    public void study(){
        System.out.println(name+"在学习");
    }

    public void sayhello(String sname){
        System.out.println(name+"向"+sname+"说,你好!");
    }

    public static void main(String[] args) {
        Student.ss = 233;
        Student.printss();
//        Student s1 = new Student();
//        s1.name="高";
//        s1.study();
//        s1.sayhello("mrma");
//
//        Student s2 = new Student();
//        s2.age=18;
//        s2.name="mashibing";

    }

}
