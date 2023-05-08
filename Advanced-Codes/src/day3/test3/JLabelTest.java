package day3.test3;

import javax.swing.*;
import java.awt.*;

public class JLabelTest {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(500,800);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        JButton button = new JButton("点击");
        button.setBounds(50,50,100,100);
        frame.getContentPane().add(button);

        //ImageIcon img =new ImageIcon("D:\\Study\\myCode\\JAVA\\Advanced-Codes\\day3\\src\\image\\1.png");
        ImageIcon img =new ImageIcon("day3\\src\\image\\1.png");
        JLabel image_1 = new JLabel(img);
        image_1.setBounds(50,150,100,100);
        frame.getContentPane().add(image_1);

        frame.setVisible(true);
    }
}