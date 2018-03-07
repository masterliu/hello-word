package com.youweek.demo;

public class Puzzledemo {
    int size;
    String breed;
    String name;
    void bark(){
        System.out.print("ruff!ruff!");
    }

}
class DogTestDrive{
    public static void main(String[] args){
        Puzzledemo d = new Puzzledemo();
        d.size=40;
        d.bark();
    }
}