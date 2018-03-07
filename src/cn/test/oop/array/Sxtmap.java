package cn.test.oop.array;

/*
* 自定义实现MAP的功能
* MAP,存放键值段,根据键对象找对应的值对象.键不能重复
* */
public class Sxtmap {
    SxtEntry[] arr = new SxtEntry[990];
    int size;

    public void put(Object key,Object value){
        SxtEntry e = new SxtEntry(key,value);
        //解决键值重复的处理.
        for (int i = 0;i<size;i++){
            if (arr[i].key.equals(value)){
                arr[i].value = value;
                return;
            }
        }
        arr[size++] = e;
    }

    public Object get(Object key){
        for (int i = 0;i<size;i++){
            if (arr[i].key.equals(key)){
                return arr[i].value;
            }
        }
        return null;
    }

    public boolean containsKey(Object key){
        for (int i = 0;i<size;i++){
            if (arr[i].key.equals(key)){
                return true;
            }
        }
        return false;
    }

    public boolean containsValue(Object value){
        for (int i = 0;i<size;i++){
            if (arr[i].key.equals(value)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Sxtmap m = new Sxtmap();
        m.put("a",new Wife("打球"));
        m.put("a",new Wife("打球a"));
        Wife w = (Wife)m.get("a");
        System.out.println(w.name);

    }
}


class SxtEntry{
    public SxtEntry(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    Object key;
    Object value;
}