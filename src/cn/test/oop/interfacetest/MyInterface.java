package cn.test.oop.interfacetest;

public interface MyInterface {
    //接口中只有:常量,抽象方法
    //public static final 接口中常量定义时,写或不写都是这样
    String MAX_GREAD="boss";
    int MAX_SPEED=120;

    //方法写或不写都是公开的
    //public abstract
    public void test01();

    public int test02(int a,int b);


}
