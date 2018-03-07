package cn.test.oop.testDate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
时间字符串的转换

 */
public class TestDateFormat {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");

        Date d = new Date(123123);
        String str = df.format(d);//将时间对象按照格式化字符串,转换为字符串
        System.out.println(str);
        System.out.println("##############");
        String str2 = "1977-7-7";
        DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date d2 = df2.parse(str2);
            System.out.println(d2);
        }catch (ParseException e){
            e.printStackTrace();
        }
    }
}


