package cn.test.oop.gen03;
/*
父类为泛型类
1,属性
2,方法

要么同时擦除,要么子类大于等于父类类型
不能子类擦除,父类泛型
属性类型:
父类中,随父类定
子类中,随子类定
方法重写:
随父类而定

 */
public abstract class Father<T> {
    T name;
    public abstract void test(T t);
}

/*
子类使用指定具体类型
属性类型为具体类型
方法同理

 */
class Child1 extends Father<String>{
    String t2;
    public void test(String t){

    }
}
/*
子类为泛型类,类型在使用时候确定
 */
class Child2<T> extends Father<T>{
    String t2;
    public void test(T t){

    }
}
/*
子类为泛型类,父类不指定类型,泛型的擦除,使用object 替换
 */
class Child3<T> extends Father{
    public void test(Object t){

    }
}

/*
子类与父类同时擦除
 */
class Child4 extends Father{
    String name;
    public void test(Object t){

    }
}

/*
错误,子类擦除,父类使用泛型

class Child5 extends Father<T>{
    String name;
    public void test(T t){

    }
}
*/