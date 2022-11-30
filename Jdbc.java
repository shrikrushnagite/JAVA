package com.jspiders.jdbc.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {

	public static void main(String[] args) {
		try {
			// 1.load the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2.Open Connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/india", "root", "root");

			// 3.prepare statement

			Statement createStatement = connection.createStatement();

			// 4.Process the Result

			ResultSet resultSet = createStatement.executeQuery("select * from ind");
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + " | " + resultSet.getString(2));
			}

			// 5.close Connection

			if (connection != null) {
				connection.close();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not Found");

		} catch (SQLException e) {
			System.out.println("Database not Found");
		}
	}
}
