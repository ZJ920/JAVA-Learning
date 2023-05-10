package OldLibraryManagementSystem.sdwz.zj.Library;

import java.sql.*;

public class GetDBConnection {
	public static Connection connectDB(String DBName,String id,String p) {
		Connection con = null;
		String uri = "jdbc:mysql://localhost:3306/"+DBName+"?serverTimezone=UTC";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch (Exception e) {
	        System.out.println("Error loading Mysql Driver!");//判断是否成功连接数据库
	    }
		try {
	    	con = DriverManager.getConnection(uri,id,p);   
		}
		catch (SQLException e) {
			System.out.println("Error loading Mysql Driver!");//判断是否成功连接数据库
		}
		return con;
	}
}