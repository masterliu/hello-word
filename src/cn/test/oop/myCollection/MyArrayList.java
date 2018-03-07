package cn.test.oop.myCollection;

/**
 * 模拟实现JDK提供的ArrayList类
 *
 */
public class MyArrayList {
    //StringBuilder bd = new StringBuilder();
    Object[] value;

    int size;



    public MyArrayList(){
        value = new Object[16];
    }

    public MyArrayList(int size){
        value =new Object[size];
    }

    public void add(Object obj){
        value[size] = obj;
        size++;
    }

    public Object get(int index){
        if (index<0||index>size-1){
            try {
                throw new Exception();//手动抛出异常
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return value[index];
    }

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add("abc");


    }

}
