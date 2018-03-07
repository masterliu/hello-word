package cn.test.oop.gen2;

import java.io.Closeable;
import java.io.IOException;

/*
���ͷ���<>��������ǩ��
ֻ�ܷ��ʶ������Ϣ,�����޸���Ϣ
 */
public class TestMethod {
    public static void main(String[] args) {
        test("aa"); //T-->string
    }
    public static <T> void test(T a){
        System.out.println(a);
    }
    public static <T extends Closeable> void test(T... a){
        for (T temp:a){
            try{
                if (null!= temp){
                    temp.close();
                }

            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
