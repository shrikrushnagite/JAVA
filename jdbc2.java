package com.jspiders.jdbc.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class jdbc2 {

	static Connection connection;
	static Statement statement;
	static ResultSet resultSet;
	static String driverPath = "com.mysql.cj.jdbc.Driver";
	static String dbPath = "jdbc:mysql://localhost:3306/mumbai_indians";
	static String username = "root";
	static String password = "root";
	static String query = "Select * from player";
	public static void main(String[] args) {
	try {
		  Class.forName(driverPath);
		  connection = DriverManager.getConnection(dbPath,username,password);
		  statement = connection.createStatement();
		  resultSet  = statement.executeQuery(query);
		  
		  while(resultSet.next()) {
			  System.out.println(resultSet.getString(1)+" | "+resultSet.getString(2)+"| "+resultSet.getString(3)+"| "+resultSet.getString(4));
		  }
		  
	} catch (ClassNotFoundException e) {
		System.out.println("Driver not Loaded");
	}catch (SQLException e) {
		System.out.println("Database not Found");
}finally {
	if(connection != null) {
try {
	connection.close();
} catch (SQLException e) {
	System.out.println("Connection not Closed");
}
}
}
}
}





