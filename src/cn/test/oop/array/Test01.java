package cn.test.oop.array;

public class Test01 {
    //数组是相同数据类型(数据类型可以为任意类型)的有序集合
    //数组也是对象,数组元素相当于对象的成员变量
    //数组长度是确定的,不可变的.如果越界则报ArrayIndexoutofBoundsException
    public static void main(String[] args) {
        int[] a = new int[3];//声明数组
        a[0] = 23;
        a[1] = 23;
        a[2] = 3;
        //double[] b = new double[2];

        car[] cars = new car[2];
        cars[0]=new car("byd");

        System.out.println(cars[0].name);
       // System.out.println(a.length);

    }
}
