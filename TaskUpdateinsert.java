package com.jspiders.jdbc.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TaskUpdateinsert {

	static Connection connection;
	static Statement statement;
	static int resultInt;
	static String driverPath = "com.mysql.cj.jdbc.Driver";
	static String dbPath = "jdbc:mysql://localhost:3306/mumbai_indians";
	static String user = "root";
	static String password = "root";
	static String q1 = "insert into player value(9,'KL rahul',23,'bol')";
	static String q2 = "insert into player value(5,' Kunal',13,'bol')";
	static String q3 = "insert into player  value(6,' Jadeja',92.'bat')";
	static String q4 = "insert into player value(7,'Manish',03,'bat')";
	static String q5 = "insert into player  value(8,'Kuldeep',12,'bol')";

	public static void main(String[] args) {

		try {
			Class.forName(driverPath);
			connection = DriverManager.getConnection(dbPath, user, password);
			statement = connection.createStatement();
			resultInt = statement.executeUpdate(q1);
			resultInt += 1;
			resultInt = statement.executeUpdate(q2);
			resultInt += 2;
			resultInt = statement.executeUpdate(q3);
			resultInt += 3;
			resultInt = statement.executeUpdate(q4);
			resultInt += 4;
			resultInt = statement.executeUpdate(q5);
			resultInt += 5;

			if (resultInt != 0) {
				System.out.println("Query ok " + resultInt + " row(s) affected");
			}

		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found");
		} catch (SQLException e) {
			System.out.println("Database not found");
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					System.out.println("Connection not closed");
				}
			}
		}
	}
}
