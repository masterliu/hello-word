package cn.test.oop.gen2;

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
public class Student<T1,T2> {
    private T1 javaScore;
    private T2 oracleScore;

    public T1 getJavaScore() {

        return javaScore;
    }

    public void setJavaScore(T1 javaScore) {
        this.javaScore = javaScore;
    }

    public T2 getOracleScore() {
        return oracleScore;
    }

    public void setOracleScore(T2 oracleScore) {
        this.oracleScore = oracleScore;
    }

    public static void main(String[] args) {
        //ʹ��ʱ��ָ������(��������)
        Student<String,Integer> stu = new Student<String,Integer> () ;
        //��ȫ:���ͼ��
        stu.setJavaScore("����");
        stu.setOracleScore(123);
        //ʡ��:����ת��
        int it = stu.getOracleScore();

    }
}
