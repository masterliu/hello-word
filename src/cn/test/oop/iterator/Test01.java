package cn.test.oop.iterator;

import java.util.*;

public class Test01 {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("aaaa");
        list.add("bbbb");

        // 通过索引便利list
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }

        //通过迭代器遍历list
        for (Iterator iter2 = list.iterator();iter2.hasNext();){
            String str = (String) iter2.next();
            System.out.println(str);
        }

        Set set = new HashSet();
        set.add("高1");
        set.add("高2");
        set.add("高3");

//        Iterator iter = set.iterator();
//        while (iter.hasNext()){String str = (String) iter.next();
//  System.out.println(str); }
          for (Iterator iter = set.iterator();iter.hasNext();){
            String str = (String) iter.next();
            System.out.println(str);
        }
    }

}
