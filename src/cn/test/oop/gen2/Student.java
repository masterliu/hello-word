package cn.test.oop.gen2;

/*
泛型类:声明时用泛型
字母:
T type 表示类型.
K V 分别代表键值中的Key Value.
E 代表Element
 使用时候确定类型
 1.泛型只能使用引用类型,不能基本类型
 2.泛型声明字母不能使用静态属性/方法
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
        //使用时候指定类型(引用类型)
        Student<String,Integer> stu = new Student<String,Integer> () ;
        //安全:类型检查
        stu.setJavaScore("优秀");
        stu.setOracleScore(123);
        //省心:类型转换
        int it = stu.getOracleScore();

    }
}
