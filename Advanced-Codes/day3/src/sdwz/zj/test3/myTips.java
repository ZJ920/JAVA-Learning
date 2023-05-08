package sdwz.zj.test3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class myTips {
    public static void main(String[] args){
        JFrame frame = new JFrame("窗口");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JButton button = new JButton("按钮");
        button.setBounds(100,100,60,30);
        frame.getContentPane().add(button);
        button.setFocusable(false);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("我被点了......");
            }
        });

        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("键盘输入了......");
            }

            @Override
            public void keyReleased(KeyEvent e) {}
        });

        frame.setVisible(true);

    }
}
interface A{
    public abstract void show();
    public abstract void show1();
}
abstract class B implements A {
   // 抽象类实现接口，可以完全覆盖/重写 接口中的方法，也可只重写接口中的某几个方法
    @Override
    public void show(){

    }
}
class C extends B {


    @Override
    public void show() {

    }

    @Override
    public void show1() {

    }
}


