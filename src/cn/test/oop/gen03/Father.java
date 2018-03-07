package cn.test.oop.gen03;
/*
����Ϊ������
1,����
2,����

Ҫôͬʱ����,Ҫô������ڵ��ڸ�������
�����������,���෺��
��������:
������,�游�ඨ
������,�����ඨ
������д:
�游�����

 */
public abstract class Father<T> {
    T name;
    public abstract void test(T t);
}

/*
����ʹ��ָ����������
��������Ϊ��������
����ͬ��

 */
class Child1 extends Father<String>{
    String t2;
    public void test(String t){

    }
}
/*
����Ϊ������,������ʹ��ʱ��ȷ��
 */
class Child2<T> extends Father<T>{
    String t2;
    public void test(T t){

    }
}
/*
����Ϊ������,���಻ָ������,���͵Ĳ���,ʹ��object �滻
 */
class Child3<T> extends Father{
    public void test(Object t){

    }
}

/*
�����븸��ͬʱ����
 */
class Child4 extends Father{
    String name;
    public void test(Object t){

    }
}

/*
����,�������,����ʹ�÷���

class Child5 extends Father<T>{
    String name;
    public void test(T t){

    }
}
*/