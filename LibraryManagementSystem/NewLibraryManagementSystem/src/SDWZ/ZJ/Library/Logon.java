package SDWZ.ZJ.Library;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Logon extends JFrame {
    //JPanel p1,p2,p3,p4,p5;//可添加组件的面板 默认FlowLayout布局
    JLabel a, userName, password;//标签 为用户提供信息
    JTextField userName1;//允许用户在文本框输入单行文本
    JPasswordField password1;//密码框
    JButton submit, cancellation;//按钮
    Logon release;//用于释放窗口
    String regex = "[a-zA-Z|0-9]+";
    Connection con;
    Statement sql;
    ResultSet rs;

    public Logon() {
        setLayout(null);//空布局（组件需要设置位置，否则不能在JPanel上显示）
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//结束窗口所在的应用程序
        setVisible(true);//设置窗口是否可见（默认不可见）
    }

    void init(String s, Logon release) {
        this.release = release;
        //System.out.println("接过来的对象（win1）为："+this.release);

        setTitle(s);//窗口名称：s是从Test传过来的
        a = new JLabel("图书管理系统登陆界面");
        a.setBounds(100, 60, 200, 100);//添加“登陆界面”并设置位置和大小

        userName = new JLabel("账 号:");
        userName.setBounds(100, 100, 200, 100);//添加“用户名”并设置位置和大小
        userName1 = new JTextField(10);
        userName1.setBounds(200, 130, 200, 40);//添加文本框并设置位置和大小 X Y 宽 高

        password = new JLabel("密 码:");
        password.setBounds(100, 140, 200, 100);//添加“密码”并设置位置和大小
        password1 = new JPasswordField(10);
        password1.setBounds(200, 170, 200, 40);//添加密码框并设置大小和位置

        submit = new JButton("登录");
        submit.setBounds(120, 240, 120, 40);//添加“提交”按钮并设置位置和大小
        cancellation = new JButton("退出");
        cancellation.setBounds(300, 240, 120, 40);//添加“取消”按钮并设置位置和大小


        add(userName);
        add(userName1);
        add(password);
        add(password1);
        add(submit);
        add(cancellation);
        add(a);//将组件添加到窗口

        setBounds(500, 300, 700, 500);//窗口位置和大小

        //使用了匿名内部类
        enter(release);//输入密码后按enter键登录
        toCancellation();//取消登录
        toLogon(release);//登录

    }

    //输入密码后按enter键登录
    private void enter(Logon release) {
        password1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                toLogon(release);
            }
        });
    }

    //按取消按钮退出程序
    private void toCancellation() {
        cancellation.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int n = JOptionPane.showConfirmDialog(null, "确定要退出吗", "退出", JOptionPane.YES_NO_OPTION);
                if (n == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
    }

    //按登录键登录
    private void toLogon(Logon release) {
        submit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                String userName2 = userName1.getText().trim();
                String password2 = password1.getText().trim();
                System.out.println("账号：" + userName2);
                System.out.println("密码:" + password2);
                if (userName2.length() == 0 || password2.length() == 0) {
                    JOptionPane.showMessageDialog(null, "账号或密码不能为空！", "消息对话框", JOptionPane.WARNING_MESSAGE);
                } else {
                    /*可记*/
                    if (userName2.matches(regex) && password2.matches(regex)) {//判断是否为非法字符

                        /*重点*/
                        con = GetDBConnection.connectDB("student", "root", "162278");
                        //	root、162278是连接MySQL的用户名和密码；student是数据库名
                        /*重点*/
                        String sqlStr = "select * from yh where ID='" + userName2 + "' and password='" + password2 + "'";
                        //查询yh表中ID、password两个数据类型
                        try {
                            sql = con.createStatement();
                            /*重点*/
                            rs = sql.executeQuery(sqlStr);

                            if (rs.next()) {
                                myWin win2 = new myWin("图书管理系统", 500, 300, 800, 500);
                                win2.setBackground(Color.blue);
                                release.dispose();//释放登录窗口
                            } else {
                                JOptionPane.showMessageDialog(null, "您输入的账号或密码不正确，请检查后重试！", "消息", JOptionPane.QUESTION_MESSAGE);
                                userName1.setText(null);
                                password1.setText(null);
                            }
                        } catch (Exception a) {
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "您输入了非法字符！", "消息对话框", JOptionPane.WARNING_MESSAGE);
                        userName1.setText(null);
                        password1.setText(null);
                    }
                }
            }
        });
    }
}