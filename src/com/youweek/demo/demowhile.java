package com.youweek.demo;

public class demowhile {
    public static void main(String[] args){
        int rand1=(int) (Math.random()*10);
        int x =1;
        System.out.println("number is "+rand1);
        while (x<3){
            System.out.print("Doo");
            System.out.print("Bee");
            x=x+1;
        }
        if (x == 3){
            System.out.print("Do");
        }
    }
}
