package cn.test.oop.interfacetest;

public class Myclass implements MyInterface{

    @Override
    public void test01() {
        //MyInterface.MAX_GREAD;
        System.out.println("test01");
    }

    @Override
    public int test02(int a, int b) {
        System.out.println("myclass.test02");
        return a+b;
    }
}
