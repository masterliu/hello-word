package cn.test.oop.gen;

/*
��ȡֵ:ǿ������ת��
�ֶ����ͼ��:����ת������ java.lang.ClassCastException;
 */
public class App {

    public static void main(String[] args) {
        Object obj = 80;
        int score;
        score = (int)obj;
        System.out.println(score);
        //jdk1.7��object -->integer--->�Զ�����
        //��������int-->integer->object
        Student stu = new Student(80,90);

        int javaseScore =(Integer)stu.getJavase();
        String oracleScore =null;
        if (stu.getOracle() instanceof String){
            oracleScore = (String)stu.getOracle();
        }
        System.out.println("fenshu:"+javaseScore+","+oracleScore);
    }
}
