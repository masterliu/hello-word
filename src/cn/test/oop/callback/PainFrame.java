package cn.test.oop.callback;

import java.awt.*;

public class PainFrame {
    public static void drawFrame(IMyFrame f){
        System.out.println("start line");
        System.out.println("add for else");
        System.out.println("see message");

        //画窗口
        f.paint();

        System.out.println("启动缓存,增加效率");

    }

    public static void main(String[] args) {
        //drawFrame(new GameFrame01());
        drawFrame(new GameFrame02());
    }
}

class GameFrame01 extends MyFrame{
    public void paint(){
        System.out.println("GameFrame01.paint()");
        System.out.println("hua chuangkou");
    }
}

class GameFrame02 implements IMyFrame{
    public void paint(){
        System.out.println("GameFrame02.paint()");
        System.out.println("hua chuangkou2");
    }
}