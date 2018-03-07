package cn.test.oop.gen;

/*
获取值:强制类型转换
手动类型检查:避免转换错误 java.lang.ClassCastException;
 */
public class App {

    public static void main(String[] args) {
        Object obj = 80;
        int score;
        score = (int)obj;
        System.out.println(score);
        //jdk1.7后object -->integer--->自动拆箱
        //存入整数int-->integer->object
        Student stu = new Student(80,90);

        int javaseScore =(Integer)stu.getJavase();
        String oracleScore =null;
        if (stu.getOracle() instanceof String){
            oracleScore = (String)stu.getOracle();
        }
        System.out.println("fenshu:"+javaseScore+","+oracleScore);
    }
}
