package cn.test.oop.gen03;

/*
������:����ʱ�÷���
��ĸ:
T type ��ʾ����.
K V �ֱ�����ֵ�е�Key Value.
E ����Element
 ʹ��ʱ��ȷ������
 1.����ֻ��ʹ����������,���ܻ�������
 2.����������ĸ����ʹ�þ�̬����/����
 */
public class Student<T1> {
    private T1 javaScore;
    private T1 oracleScore;

    public T1 getJavaScore() {

        return javaScore;
    }

    public void setJavaScore(T1 javaScore) {
        this.javaScore = javaScore;
    }

    public T1 getOracleScore() {
        return oracleScore;
    }

    public void setOracleScore(T1 oracleScore) {
        this.oracleScore = oracleScore;
    }

    public static void main(String[] args) {
        //ʹ��ʱ��ָ������(��������)
        Student<Object> stu = new Student<Object>() ;
        //��ȫ:���ͼ��
        stu.setJavaScore("����");
        stu.setOracleScore(123);

        //����,�������ͼ��
        //test(stu);
        test1(stu);

        //ʡ��:����ת��
       // int it = stu.getOracleScore();

    }
    public static void test(Student<Integer> a){

    }
    public static void test1(Student<?> a){

    }

}
