package com.te.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
	public static void main(String[] args) {
		Connection connection = null;
		Statement createStatement = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "Vivekgowda@1998");
			createStatement = connection.createStatement();
			boolean execute = createStatement.execute("insert into sweets values(101,'Mysorepak',10,2)");
			boolean execute1 = createStatement.execute("insert into sweets values(102,'gulabjamun',20,2)");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (createStatement != null) {
				try {
					createStatement.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
		}
	}
}
