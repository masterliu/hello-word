package cn.test.oop.gen03;
/*
���ͽӿ�:��̳�ͬ��
��д�����游�ඨ
 */
public interface Comparable<T> {
    void compare(T t);
}
//��������ָ����������
class Comp implements Comparable<Integer>{

    @Override
    public void compare(Integer t) {

    }
}
//����
class Comp1 implements Comparable{

    @Override
    public void compare(Object t) {

    }
}
// �������,���෺��
class Comp2<T> implements Comparable{

    @Override
    public void compare(Object o) {

    }
}
//���෺��>=���෺��
class Comp3<T> implements Comparable<T>{

    @Override
    public void compare(T t) {

    }
}
//���෺��,�����������