package cn.test.oop.gen04;

/*
��̬��������ʽ
 */
public class FruitApp {
    public static void main(String[] args) {
        Fruit f = new Apple();
        test(new Apple());
    }
    //�β�ʹ�ö�̬
    public  static void test(Fruit f){

    }
    //��������ʹ�ö�̬
    public static Fruit test2(){
        return new Apple();
    }
}
