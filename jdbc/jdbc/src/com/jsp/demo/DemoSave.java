package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoSave {
  public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/javabatch";
		String username="root";
		String password="Y1012Jqkhkp";
		
		String sql="INSERT INTO product VALUES(8,'PETERENGLANG','SHIRT')";
		Connection connection = null;
		try {
			//load/Register the driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			//to establish connection		
			connection= DriverManager.getConnection(url,username,password);
			//create statement
			Statement statement = connection.createStatement();
			//execute the statement
			statement.execute(sql);
			System.out.println("All Good");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			//close the connection
			connection.close();
		}
				
		
	}
}
		