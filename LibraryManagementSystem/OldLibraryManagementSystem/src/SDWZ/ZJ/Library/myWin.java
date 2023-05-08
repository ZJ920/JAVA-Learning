package SDWZ.ZJ.Library;

import java.awt.*;
import javax.swing.*;

public class myWin extends JFrame{
	JMenuBar menubar1;//菜单条
    JMenu menu1,menu2;//菜单
    JMenuItem item1,item2,item3,item4,item5;//菜单项
    Reader jsq2;
    myWin (String s,int a,int b,int c,int d){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        init(s,a,b,c,d);
    }
    void init(String s,int a,int b,int c,int d) {
        setBounds(a,b,c,d);
        setTitle(s); 
        menubar1 = new JMenuBar();

        item1 = new JMenuItem("查询图书");
        item2 = new JMenuItem("添加借阅者");
        item3 = new JMenuItem("其他");
        menu1 = new JMenu("功能");
        menu1.add(item1);
        menu1.add(item2);
        menu1.add(item3);
        
        item4 = new JMenuItem("广告招租");
        item5 = new JMenuItem("帮助");
        menu2 = new JMenu("其他");
        menu2.add(item4);
        menu2.add(item5);
        
        menubar1.add(menu1);
        menubar1.add(menu2);

        setJMenuBar(menubar1);
        jsq2 = new Reader();
        item2.addActionListener(jsq2);
    }
}