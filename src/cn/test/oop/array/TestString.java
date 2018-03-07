package cn.test.oop.array;


/**
 * Sring:不可变字符序列
 * build,可变字符序列
 */
public class TestString {
    public static void main(String[] args) {
        String str = new String("abcd");
        String str2 = new String("abcd");

        //比较内容是否相等
        System.out.println(str.equals(str2));

        System.out.println("abc".equalsIgnoreCase("Abc"));
        System.out.println("abcd".toUpperCase());//to大写
        System.out.println("ABCD".toLowerCase());//to小写

        //追加
        //stringBuilder 不安全,效率高
        System.out.println("#############");
        StringBuilder str4 = new StringBuilder("a");
        for (int i = 0;i<10;i++){
            str4.append(i);
        }
        System.out.println(str4);


        //synchronized线程安全,效率低
        StringBuffer bf = new StringBuffer();

        System.out.println("#######");

        //split 切割
        String str3 ="a,b,c,d";
        String[] strarray = str3.split(",");
        for(int i = 0; i<strarray.length;i++){
            System.out.println(strarray[i]);




        }
    }
}
