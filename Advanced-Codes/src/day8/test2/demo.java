package day8.test2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class demo {
    public static void main(String[] args){
        JFrame jFrame = new JFrame();
        jFrame.setTitle("监听事件练习");
        jFrame.setSize(514, 595);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setAlwaysOnTop(true);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(null);
        jFrame.setVisible(true);//最后显示窗口
        JButton jButton = new JButton("点击");
        jButton.setBounds(50,50,50,50);
        jButton.setFocusable(false);
        jFrame.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("点击");
            }
        });
        jFrame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("键入");
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }
}
