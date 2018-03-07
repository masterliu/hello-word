package com.youweek.demo;

/*创建对象
声明,声明一个对象,包括名称和类型 string name
实例化,使用关键字new来创建对象
初始化,创建对象时候,会调用构造方法初始化对象
*/
public class helloword {
    int puppyAge;
    //构造方法,必须和类同名,可以有多个构造方法.
    public helloword(String name){
        System.out.println("dogs name:" + name);
    }
    public void setAge(int age) {
        puppyAge = age;
    }
    public int getAge(){
        System.out.println("dog age:" + puppyAge);
        return puppyAge;
    }
    public static void main(String[] args){
        //使用new创建helloword对象(实例化)
        helloword myhelloword = new helloword("tommy");
        //通过方法设置age
        myhelloword.setAge(2);
        //通过方法获取age
        myhelloword.getAge();
        //访问成员变量
        System.out.println("变量is:" + myhelloword.puppyAge);

        System.out.println(Byte.SIZE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);



    }
}
