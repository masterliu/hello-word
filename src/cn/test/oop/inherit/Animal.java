package cn.test.oop.inherit;

public class Animal {

    String eye;

    public void run() {
        System.out.println("run run!");
    }

    public void eat() {
        System.out.println("eat eat!");
    }
}

class Mammal extends Animal {
    public void taisheng() {
        System.out.println("taisheng.");
    }

}

class paxing extends Animal {

    public void run() {
        System.out.println("fly!!");
    }

    public void eggs() {
        System.out.println("luan sheng.");
    }
}
