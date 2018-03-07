package cn.test.oop.testbox;

public class Test02 {
    public static void main(String[] args) {
        //Integer a = new Integer(1000);

        Integer a = 1000;//jdk5.0 after autoboxing 自动装箱 编译器帮助改进代码:Integer a = new Integer(1000);---- before

        Integer b = 2000;

        int c = new Integer(1500); //编译器改进:new Integer(1500).intValue();
        int d = b;//自动拆箱,unboxing,编译器改进:b.intValue();

        System.out.println(d);

        Integer ee =1234;
        Integer e2 = 1234;
        System.out.println(ee == e2); //false
        System.out.println(ee.equals(e2));//true 比较2个值


        System.out.println("#############");
        Integer f =123;//[-128,127]之间的数,仍然当做基本数据类型处理
        Integer f2 = 123;
        System.out.println(f == f2); //true
        System.out.println(f.equals(f2));//true 比较2个值

    }
}
