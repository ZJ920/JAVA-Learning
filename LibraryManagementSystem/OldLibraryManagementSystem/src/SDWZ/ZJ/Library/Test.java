package SDWZ.ZJ.Library;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test extends JFrame{
	//JPanel p1,p2,p3,p4,p5;//可添加组件的面板 默认FlowLayout布局
	JLabel a,yhm,mm;//标签 为用户提供信息
	JTextField yhm1;//允许用户在文本框输入单行文本
	JPasswordField mm1;//密码框
	JButton tijiao,quxiao;//按钮
	Test shifang;//用于释放窗口

	public Test(){
		setLayout(null);//空布局（组件需要设置位置，否则不能在JPanel上显示）
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//结束窗口所在的应用程序
		setVisible(true);//设置窗口是否可见（默认不可见）
	}

	void init(String s,Test shifang){
		this.shifang = shifang;
		//System.out.println("接过来的对象（win1）为："+this.shifang);

		setTitle(s);//窗口名称：s是从Mywindow传过来的
		a=new JLabel("图书管理系统登陆界面");
		a.setBounds(100,60,200,100);//添加“登陆界面”并设置位置和大小
		
		yhm=new JLabel("账 号:");
		yhm.setBounds(100,100,200,100);//添加“用户名”并设置位置和大小
		yhm1=new JTextField(10);
		yhm1.setBounds(200,130,200,40);//添加文本框并设置位置和大小 X Y 宽 高
		
		mm=new JLabel("密 码:");
		mm.setBounds(100,140,200,100);//添加“密码”并设置位置和大小
		mm1=new JPasswordField(10);
		mm1.setBounds(200,170,200,40);//添加密码框并设置大小和位置
		
		tijiao=new JButton("登录");
		tijiao.setBounds(120,240,120,40);//添加“提交”按钮并设置位置和大小
		quxiao=new JButton("退出");
		quxiao.setBounds(300,240,120,40);//添加“取消”按钮并设置位置和大小

        
		add(yhm);
		add(yhm1);
		add(mm);
		add(mm1);
		add(tijiao);
		add(quxiao);
		add(a);//将组件添加到窗口
        
		setBounds(500,300,700,500);//窗口位置和大小

		ReaderListen jsq1=new ReaderListen();//创建监视器 jsq1是监视器
		mm1.addActionListener(jsq1);//按回车键触发监视器
		tijiao.addActionListener(jsq1);//“提交”按钮将“jsq1”注册为自己的监视器 点击“提交”触发监视器

		jsq1.setJTextField(yhm1);//将“yhum1”传进ReaderLiten
		jsq1.setJPasswordField(mm1);//将“mm1”传进ReaderLiten
		jsq1.setJButton(quxiao);
		jsq1.Shifang(shifang);//用于释放窗口
		//System.out.println("接到后要传过去的对象（shifang）为："+shifang);
	}
}