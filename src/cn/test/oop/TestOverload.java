package cn.test.oop;

public class TestOverload {
    public static void main(String[] args) {
        MyMath m = new MyMath();
        int result = m.add(4,5,10);
        System.out.println(result);
    }

}
class MyMath{

    int a;
    int b;
    public MyMath(){
    }
    public MyMath(int a){
        this.a = a;

    }
    /**
     * 构造方法重载
     * @param b
     * @param a
     */
    public MyMath(int b,int a){
        this.b =b;
        this.a =a;
    }

    public int add(double a,int b){
        return (int)(a+b);
    }
    //重载add()
    //类型不同构成重载
    //个数不同构成重载
    //顺序不同构成重载
    public int add(int a,int b,int c){
        return a+b+c;
    }
}