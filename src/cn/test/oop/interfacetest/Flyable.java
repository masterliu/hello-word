package cn.test.oop.interfacetest;

public interface Flyable {
    int MAX_SPEED=11000;
    int MIN_HEIGHT=1;

    void fly();
}
//定义接口
interface Attack{
    void attck();
}

class Plane implements Flyable{
    public void fly(){
        System.out.println("plane fly");
    }
}

class Man implements Flyable{
    @Override
    public void fly() {
        System.out.println("jump men");
    }
}

class Stone implements Flyable,Attack{
    @Override
    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void attck() {
        System.out.println("stone attck");

    }
}