package cn.test.oop.testDate;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 测试日期类
 */
public class TestCalendar {
    public static void main(String[] args) {
        Calendar c = new GregorianCalendar();
        //c.set(2001,1,10,12,23,45);//设置时间
        c.set(Calendar.YEAR,2017);//单独设定年月日数据,时分秒未设置按照系统时间获取
        c.set(Calendar.MONTH,3);
        c.set(Calendar.DATE,10);
        //c.setTime(new Date());
        Date dd = c.getTime();
        System.out.println(dd);

        //日期计算
        c.add(Calendar.DATE,30);//日期计算,+30天
        c.add(Calendar.MONTH,2);//+2月
        System.out.println(c);
    }
}
