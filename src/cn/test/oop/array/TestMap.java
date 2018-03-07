package cn.test.oop.array;


import java.util.HashMap;
import java.util.Map;

//map 的用法
public class TestMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("san",new Wife("ww"));
        map.put("sss",new Wife("aa"));
        map.put("sss",new Wife("bb"));

        Wife w = (Wife) map.get("sss");
        map.remove("san");

        map.containsKey("san");

        System.out.println(w.name);

    }

}
class Wife{
    String name;
    public Wife(String name){
        this.name =name;
    }

}
