package cn.test.oop.array;

import java.util.HashMap;

/**
 * 自定义hashSet
 */
public class SxtHashSet {
    HashMap map;
    private static final  Object PRESENT = new Object();
    public SxtHashSet(){
        map = new HashMap();

    }
    public int size(){
        return map.size();
    }
    public void add(Object o){
        map.put(o,PRESENT);//set的不可重复就是利用了map里面键对象的不可重复
    }
    public void remove(Object o){
        map.remove(o,PRESENT);
    }

    public static void main(String[] args) {
        SxtHashSet s = new SxtHashSet();
        s.add("aaaa");
        s.add(new String("aaaa"));
        System.out.println(s.size());
    }
}
