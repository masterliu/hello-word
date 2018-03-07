package cn.test.oop.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器的get remove add 使用
 */

public class SxArrayList {

    private Object[] elementData;

    private int size;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return isEmpty();
    }

    public SxArrayList() {
        this(10);

    }

    public SxArrayList(int initialCapacity) {
        if (initialCapacity < 0) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        elementData = new Object[initialCapacity];
    }

    public void add(Object obj) {
        //数组扩容和数据的拷贝
      //  ensureCapacity();
        if (size == elementData.length) {
            Object[] newArray = new Object[size * 2 + 1];
            System.arraycopy(elementData, 0, newArray, 0, elementData.length);

            // 替换新的容器
            elementData = newArray;
        }
        elementData[size++] = obj;
        //size++;


    }

    public Object get(int index) {
        rangeCheck(index);
        return elementData[index];

    }

    public void remove(int index){
        //删除指定位置对象
        rangeCheck(index);
        int numMoved = size -index -1;
        if (numMoved>0){
            System.arraycopy(elementData,index+1,elementData,index,numMoved);

        }
        elementData[--size] = null;
    }

    public void remove(Object obj){
        for (int i = 0;i<size;i++){
            if (get(i).equals(obj)){
                //注意:底层调用的equals方法而不是==
                remove(i);
            }
        }
    }

    public Object set(int index,Object obj){

        rangeCheck(index);

        Object oldValue = elementData[index];
        elementData[index] = obj;
        return oldValue;
    }
    public void add(int index,Object obj){
        rangeCheck(index);
        ensureCapacity();// 数组的扩容


        System.arraycopy(elementData,index,elementData,index+1,size-index);
        elementData[index]=obj;
        size++;

    }
    private void ensureCapacity(){
        if (size == elementData.length){
            Object[] newArray = new Object[size*2+1];
            System.arraycopy(elementData,0,newArray,0,elementData.length);
            elementData = newArray;
        }

    }

    private  void rangeCheck(int index){
        if (index>=size){
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SxArrayList list = new SxArrayList(3);
        list.add("333");
        list.add("222");
        list.add("33113");
        list.add("31133");

        System.out.println(list.size());
        System.out.println(list.get(3));
        System.out.println(list.set(3,("aaaaa")));

    }
}
