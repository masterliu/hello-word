package cn.test.oop.abstraclass;
//抽象类
//抽象方法 肯定在抽象类中
//不影响其他的属性添加
//抽象类只能用来继承
//抽象方法的意义:将方法的设计和实现分离
public abstract class Animal {
    String str;
    public abstract void run();
    public void breath(){
        System.out.println("huxi");
        run();
    }
}
//实现抽象方法必须
//重写抽象方法
class Cat extends Animal{

    @Override
    public void run() {
        System.out.println("miao");

    }
}
class Dog extends Animal{
    public void run(){
        System.out.println("dog run");
    }
}
