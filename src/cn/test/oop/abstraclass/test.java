package cn.test.oop.abstraclass;

public class test {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.run();
        a.breath();

/*两维数组声明的两种方法
 int [][] b ={
            {1,2},
            {4,5,0,9},
            {5,6,7}
    };


 */


       int[][] b = new int[3][];
        b[0] = new int[2];
        b[1] = new int[4];
        b[2] = new int[3];

        b[0][0] = 1;
        b[0][1] = 2;
        b[1][0] = 4;
        b[1][1] = 5;
        b[1][2] = 0;
        b[1][3] = 9;
        b[2][0] = 5;
        b[2][1] = 6;
        b[2][2] = 7;



    }





}
