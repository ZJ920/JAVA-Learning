package SDWZ.ZJ.Library;

import java.awt.event.*;
import javax.swing.*;
public class Reader extends JFrame implements ActionListener {
	public void actionPerformed (ActionEvent e) {
			JLabel xm,xh,sm,rq,gs;
			JTextField xm1,sm1,rq1,xh1;
			JButton tijiao,quxiao;
			ReaderListen2 jsq;
			
			setLayout(null);
			setVisible(true);
		    setBounds(300,200,700,500);
		    setTitle("借阅者信息"); 
		    
		    xm = new JLabel("姓名：");
		    xm.setBounds(100,100,50,100);
			xm1=new JTextField(10);
			xm1.setBounds(300,120,200,40);
			
			xh = new JLabel("学号：");
			xh.setBounds(100,140,50,100);
			xh1= new JTextField(20);
			xh1.setBounds(300,160,200,40);
			
			sm = new JLabel("书名：");
		    sm.setBounds(100,180,50,100);
			sm1=new JTextField(20);
			sm1.setBounds(300,200,200,40);
			
			rq = new JLabel("借阅日期:");
			rq.setBounds(100,220,100,100);
			rq1=new JTextField(20);
			rq1.setBounds(300,240,200,40);
			
			gs = new JLabel("日期格式：xxxx-xx-xx||书名格式：《xxxx》");
			gs.setBounds(100,260,300,100);
			
			tijiao = new JButton("提交");
			tijiao.setBounds(100,380,120,40);
			quxiao  = new JButton("取消");
			quxiao.setBounds(260,380,120,40);
			
			super.add(xm);
			add(xm1);
			add(xh);
			add(xh1);
			add(sm);
			add(sm1);
			add(rq);
			add(rq1);
			add(tijiao);
			add(quxiao);
			add(gs);
			
	        jsq =new ReaderListen2();
	        tijiao.addActionListener(jsq);
	        jsq.xm(xm1);
	        jsq.xh(xh1);
	        jsq.sm(sm1);
	        jsq.rq(rq1);
	        jsq.Shifang(this);
    }
}