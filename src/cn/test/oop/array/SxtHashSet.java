package cn.test.oop.array;

import java.util.HashMap;

/**
 * �Զ���hashSet
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
        map.put(o,PRESENT);//set�Ĳ����ظ�����������map���������Ĳ����ظ�
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
