package cn.test.oop.testDate;
import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        Date d = new Date();
        long t = System.currentTimeMillis();
        System.out.println(t);
        System.out.println(d.getTime()); //得到一个long类型的时间


    }
}
