package com.youweek.demo;

import java.util.Scanner;

public class TestScanner {


    public static void test02() {
        Scanner s = new Scanner(System.in);
        int sa=s.nextInt();
        System.out.println("input number is:"+sa);
    }
    public static void main(String[] args) {
        test02();
    }
}
