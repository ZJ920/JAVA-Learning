package SDWZ.ZJ.Library;

import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;

public class ReaderListen2 implements ActionListener {
	JTextField xm2,sm2,rq2,xh2;
	Reader b;
	Connection con;
	Statement  sql;
	ResultSet  rs;
	PreparedStatement preSql;
	
    void xm(JTextField xm1) {
		xm2=xm1;
	}
    void sm(JTextField sm1) {
		sm2=sm1;
	}
    void rq(JTextField rq1) {
		rq2=rq1;
	}
    void xh(JTextField xh1) {
		xh2=xh1;
	}
    void Shifang(Reader j) {
    	b=j;
    }
    public void actionPerformed (ActionEvent e) {
    	String  xm3 = xm2.getText();
    	String  sm3 = sm2.getText();
    	String  rq3 = rq2.getText();
    	String  xh3 = xh2.getText();
    	con = GetDBConnection.connectDB("student","root","162278");
    	String sqlStr ="insert into reader values(?,?,?,?)";
    	if(xm3.length()==0||sm3.length()==0||rq3.length()==0||xh3.length()==0) {
			JOptionPane.showMessageDialog(null,"请填写借阅者信息！","提示对话框",JOptionPane.WARNING_MESSAGE);
		}else{
    	    try {
    		    preSql = con.prepareStatement(sqlStr);
    		    preSql.setString(1, xm3);
    		    preSql.setString(2, xh3);
    		    preSql.setString(3, sm3);
    		    preSql.setString(4, rq3);
    		    preSql.executeUpdate();
    		    con.close();
    	    }
    	    catch(SQLException e2) {}
    	    JOptionPane.showMessageDialog(null,"借阅者信息插入成功","提示对话框",JOptionPane.PLAIN_MESSAGE);
    	    b.dispose();
		}
    }
}
