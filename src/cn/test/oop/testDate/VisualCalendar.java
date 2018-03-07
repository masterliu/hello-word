package cn.test.oop.testDate;

import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 可视化日历程序
 */
public class VisualCalendar {
    public static void main(String[] args) {
        System.out.println("请输入日期(按照格式:2017-12-11):");
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();

        DateFormat fomat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date= fomat.parse(temp);
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(date);

            int day = calendar.get(Calendar.DATE);

            calendar.set(calendar.DATE,1);
            //System.out.println(calendar.get(Calendar.DAY_OF_WEEK));//1号属于周几

            //System.out.println();//当月最大日期
            int maxDate =calendar.getActualMaximum(Calendar.DATE);
            System.out.println("日\t一\t二\t三\t四\t五\t六");

            for (int i = 0;i<calendar.get(Calendar.DAY_OF_WEEK)-1;i++){
                System.out.print("\t");
            }

            int j = 0;
            for (int i = 1;i<= maxDate;i++){
                if (i==day){
                    System.out.print("*");
                }
                System.out.print(i+"\t");
                j++;
                int w = calendar.get(Calendar.DAY_OF_WEEK);
                if (w== Calendar.SATURDAY){
                    System.out.print("\n");
                }
                calendar.add(Calendar.DATE,1);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
