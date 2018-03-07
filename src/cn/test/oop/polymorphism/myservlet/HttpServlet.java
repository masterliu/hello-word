package cn.test.oop.polymorphism.myservlet;

public class HttpServlet {

    public void service(){
        System.out.println("httpservlet.service()");
        doGet();
    }
    public void doGet(){
        System.out.println("httpservlet.doGet()");
    }
}
