package com.velocity.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConnectionDemo {
	
	

	public static  Connection getConnection() throws SQLException  {
		Connection connection=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/quizapp","root","Akash@123");
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		return connection;
		
	}

	

}
		
	


