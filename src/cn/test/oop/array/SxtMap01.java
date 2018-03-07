package cn.test.oop.array;

import java.util.LinkedList;

/**
 * Map 底层实现:数组+链表
 * 自定义MAP的升级版
 * 提高查询效率
 */
public class SxtMap01 {

    LinkedList[] arr = new LinkedList[999];
    int size;

    public void put(Object key,Object value){
        SxtEntry e = new SxtEntry(key,value);

        int a = key.hashCode()%arr.length;
        if (arr[a]==null){
            LinkedList list = new LinkedList();
            arr[a] = list;
            list.add(e);
        }else {
            LinkedList list = arr[a];
            for (int i = 0;i<list.size();i++){
                SxtEntry e2 = (SxtEntry) list.get(i);
                if (e.key.equals(key)){
                    e2.value = value; //键值重复直接覆盖
                    return;
                }
            }
        }
    }

    public Object get (Object key){
        //return arr[key.hashCode()%999];
        int a = key.hashCode()%arr.length;
        if (arr[a]!=null){
            LinkedList list = arr[a];
            for (int i = 0;i<list.size();i++){
                SxtEntry e = (SxtEntry) list.get(i);
                if (e.key.equals(key)){
                    return e.value;
                }
            }
        }
        return null;
    }


    public static void main(String[] args) {
        SxtMap01 m = new SxtMap01();
        m.put("a",new Wife("打球"));
        m.put("a",new Wife("打球a"));
        Wife w = (Wife)m.get("a");
        System.out.println(w.name);

    }

}
