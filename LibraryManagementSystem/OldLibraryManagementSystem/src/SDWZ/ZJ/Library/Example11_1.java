package SDWZ.ZJ.Library;

import java.sql.*;
public class Example11_1 {
	public static void main(String[] args) {
		Connection con=null;
	      Statement sql; 
	      ResultSet rs;
	      try {
	    	  Class.forName("com.mysql.cj.jdbc.Driver");//JDBK-MySQL驱动代码
	      }
	      catch(Exception e) {}
	      String uri="jdbc:mysql://localhost:3306/student?serverTimezone=UTC"; 
	      String user="root";
	      String password="162278";
	      try { 
	          con=DriverManager.getConnection(uri,user,password);//连接代码
	      }
	      catch(SQLException e) {}
	      try {
	          sql=con.createStatement();
	          rs=sql.executeQuery("SELECT * FROM mess");//查询mess表
	          while(rs.next()) {
	             String number=rs.getString(1);
	             String name=rs.getString(2);
	             Date date=rs.getDate(3);
	             float height=rs.getFloat(4);
	             System.out.printf("%s\t",number);
	             System.out.printf("%s\t",name);
	             System.out.printf("%s\t",date); 
	             System.out.printf("%.2f\n",height);
	          }
	          con.close();
	      }
	      catch(SQLException e) { 
	         System.out.println(e);
	      }
	}

}
