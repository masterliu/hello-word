package cn.test.oop.collectior;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 容器的操作
 */
public class Test {

    public static void main(String[] args) {
        List list = new ArrayList();
        //ArrayList :地才实现是数组,所以,查询快,修改\插入和删除慢.
        //LinkedList:底层实现是链表,所以,查询慢,修改插入删除快.
        //Vector:线程安全的.效率低.
        list.add("aaa");
        list.add(new Date());
        list.add(new Dog());
        list.add(1234);//包装类的,自动装箱.

        System.out.println(list.size());
        System.out.println(list.isEmpty());
//        list.remove("aaa");
//        System.out.println(list.size());
        List list2 = new ArrayList();
        list2.add("bbb");
        list2.add("ccc");

        list.add(list2);
        System.out.println(list.size());


        //跟顺序的操作.
        String str = (String)list.get(0);
        System.out.println(str);



    }

}

class Dog{

}