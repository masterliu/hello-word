package cn.test.oop.array;

public class Test02 {
    public static void main(String[] args) {
        //声明
        int a [];
        int [] b;

        //创建数组对象
        a = new int[4];
        b = new int[5];
        //初始化(对数组元素的初始化)
        //默认初始化:数组元素想到那个鱼对象的成员变量.默认值跟成员变量的规则一样数字0.
        //动态初始化
        for (int i =0;i<a.length;i++){
            a [i]=i*12;
            System.out.println(a);
        }



        //静态初始化
        int c[]={1,2,3,4};//长度4,索引范围[0,3]
        car[] cars={new car("benci"),new car("bmw")};
    }
}
