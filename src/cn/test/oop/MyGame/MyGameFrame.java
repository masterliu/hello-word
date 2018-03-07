package cn.test.oop.MyGame;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *游戏窗口
 */
public class MyGameFrame extends Frame {
    //GUI编程:AWT,SWING等,基本用不到,不需要深抓,不是重点.

    Image img = GameUtil.getImage("images/4.jpg");

    //加载装口
    public void launchFrame(){
        setSize(500,500);
        setLocation(100,100);
        setVisible(true);

        new PaintThread().start();

      addWindowListener(new WindowAdapter() {
          @Override
          public void windowClosing(WindowEvent e) {
              System.exit(0);
          }
      });
    }

   private double x=100,y=100;

    @Override
    public void paint(Graphics g) {
        //System.out.println("paint");
        g.drawLine(100,100,200,200);
        g.drawRect(100,100,200,200);
        g.drawOval(100,100,200,200);

        Color c = g.getColor();
        g.setColor(Color.RED);
        g.fillOval(300,300,20,20);
        g.setColor(c);

        // 加载图片
        g.drawImage(img,(int)x,(int)y,null);
        x += 3;
        y += 3;
    }

    /*
    定义一个重画窗口的线程类,是一个内部类
     */
    class PaintThread extends Thread{
        public void run(){
            while(true){
                repaint();
                try {
                    Thread.sleep(50);//1s=1000ms
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        MyGameFrame gf = new MyGameFrame();
        gf.launchFrame();
    }


}
