package cn.test.oop.Exception;

public class Error {
    public static void main(String[] args) {
        //unchecked
       // System.out.println(1/0);

        //checked,
        Computer c = null;
        if (c != null){
            c.start(); //抛出空指针异常nullPointerException,对象是null,调用了对象的方法或属性
        }

    }
}
class Computer{
    void start(){
        System.out.println("computer start!");
    }
}
