package cn.test.oop.inherit;

//组合
//is -a  使用继承 是的关系 哺乳动物是动物
//has -a 使用组合 拥有关系 鸟类拥有爪子,眼睛

public class Animal2 {

        String eye;

        public void run() {
            System.out.println("run run!");
        }

        public void eat() {
            System.out.println("eat eat!");
        }

    public static void main(String[] args) {
        bird2 bird = new bird2();
        bird.run();
        bird.animal2.eat();
    }

}
class bird2{
    Animal2 animal2 = new Animal2();
    public void run() {
        animal2.run();
        System.out.println("fly!!");
    }
    public void eggsheng(){
        System.out.println("egg sheng!");
    }

    public bird2(){
        System.out.println("create a bird!");
    }
}




