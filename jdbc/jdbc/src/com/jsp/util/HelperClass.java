package com.jsp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HelperClass {
	String url="jdbc:mysql://localhost:3306/javabatch";
	String username="root";
	String password="Y1012Jqkhkp";
	
	public Connection getConnection() {
		Connection connection=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection=DriverManager.getConnection(url,username,password);
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
}
