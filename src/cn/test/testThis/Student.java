package cn.test.testThis;

public class Student {
    String name;
    int id;
    public Student(String name,int id){
        this();//通过this调用其他构造方法,只能在语句第一行
        //this(name);
        this.name = name;
        this.id = id;
    }

    public Student(String name){
        this.name=name;
    }

    public Student(){
        System.out.println("构造一个对象");
    }
    public void setName(String name){
        this.name=name;
    }

    //this 当前方法的对象
    //构造方法中,this指向初始化的对象
    public void study(){
        name = "Mr 3";
        System.out.println(name+"study");

    }

    public void sayHello(String sname){
        System.out.println(name+"to"+sname+"say:hi");
    }
}
