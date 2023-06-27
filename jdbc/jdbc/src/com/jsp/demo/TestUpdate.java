package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestUpdate {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/javabatch";
		String username="root";
		String password="Y1012Jqkhkp";
		
		String sql="UPDATE PRODUCT SET NAME='PANT' WHERE ID=1";
		Connection connection = null;
		try {
			//load/Register the driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			//to establish connection		
			connection= DriverManager.getConnection(url,username,password);
			//create statement
			Statement statement = connection.createStatement();
			//execute the statement
			int a=statement.executeUpdate(sql);
			if(a>0) {
				System.out.println("data updated");
			}else {
				System.out.println("not updated");
			}
			
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


	
