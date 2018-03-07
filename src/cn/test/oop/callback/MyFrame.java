package cn.test.oop.callback;

public class MyFrame {
    public void paint() {
        System.out.println("把自己窗口画出来");

    }


}

interface IMyFrame {
    void paint();

}