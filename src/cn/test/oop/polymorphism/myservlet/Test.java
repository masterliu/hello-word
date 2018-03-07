package cn.test.oop.polymorphism.myservlet;

public class Test {
    public static void main(String[] args) {
        HttpServlet s = new MyServlet();
        s.service();
    }
}
