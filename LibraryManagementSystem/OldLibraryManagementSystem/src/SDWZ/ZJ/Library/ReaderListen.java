package SDWZ.ZJ.Library;

import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;

public class ReaderListen implements ActionListener {//负责创建监视器的类 ReaderListen实现了ActionListener接口
	JTextField tiquyhm1;
	JPasswordField tiqumm1;
	JButton quxiao;
	String regex= "[a-zA-Z|0-9]+";
	Statement sql;
	ResultSet rs;
	Connection con;
	Test shifang;//用于释放窗口
    void setJTextField(JTextField yhum1) {
		tiquyhm1=yhum1;
	}
    //
	void setJPasswordField(JPasswordField mm1) {
		tiqumm1=mm1;
	}
	//
	void Shifang(Test shifang) {
		this.shifang=shifang;
		//System.out.println("再接过来的对象（shifang）为："+this.shifang);
	}
	//用于释放窗口
	public void setJButton(JButton quxiao1) {
		quxiao=quxiao1;
		quxiao.addActionListener(
				new ActionListener(){
				    public void actionPerformed (ActionEvent e){
					    int n=JOptionPane.showConfirmDialog(null,"确定要退出吗","退出",JOptionPane.YES_NO_OPTION);
				    	if(n==JOptionPane.YES_OPTION) {
						    System.exit(0);
					    }
				    }
			    }    
		 );
	}
	//
	@Override
	public void actionPerformed (ActionEvent e) {//tijiao.addActionListener(jsq1); 将事件对象传递给参数e
		String xianshiyhm=tiquyhm1.getText().toString().trim();
		String xianshimm=tiqumm1.getText().toString().trim();
		System.out.println("账号："+xianshiyhm);
		System.out.println("密码:"+xianshimm);
		if(xianshiyhm.length()==0||xianshimm.length()==0) {
			JOptionPane.showMessageDialog(null,"账号或密码不能为空！","消息对话框",JOptionPane.WARNING_MESSAGE);
		}else{
/*可记*/		    if(xianshiyhm.matches(regex)&&xianshimm.matches(regex)) {//判断是否为非法字符
			    	
/*重点*/				con = GetDBConnection.connectDB("student", "root","162278");
					//	root、162278是连接MySQL的用户名和密码；student是数据库名
			    	//String n = "ID='xianshiyhm'";
			    	//String p = "password='xianshimm'";
			    	//String sqlStr="select*from yh where "+n+" and "+p+"";

/*重点*/		    	String sqlStr = "select * from yh where ID='"+xianshiyhm+"' and password='"+xianshimm+"'";
					//查询yh表中ID、password两个数据类型
			    	try {
			    		sql=con.createStatement();
/*重点*/		    		rs=sql.executeQuery(sqlStr);

			    	if(rs.next()) {
			    	    myWin win2= new myWin("图书管理系统",500,300,800,500);
			    	    win2.setBackground(Color.blue);
						shifang.dispose();//释放登录窗口
			    	}else{
			    		    JOptionPane.showMessageDialog(null,"您输入的账号或密码不正确，请检查后重试！","消息",JOptionPane.QUESTION_MESSAGE);
							tiquyhm1.setText(null);
					        tiqumm1.setText(null);
			    	 }
			    	}
			    	catch(Exception a) {}
			    }else{
					   JOptionPane.showMessageDialog(null,"您输入了非法字符！","消息对话框",JOptionPane.WARNING_MESSAGE);
					   tiquyhm1.setText(null);
			           tiqumm1.setText(null);
		    	}
		}
	}
	//
}