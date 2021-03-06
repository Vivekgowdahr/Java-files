package com.te.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertUsingPrepareStmt {
public static void main(String[] args) {
	Connection connection = null;
	PreparedStatement statement =null;
	try {
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root", "Vivekgowda@1998");
		statement= connection.prepareStatement("Insert into sweets value(?,?,?,?)");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sweet ID");
		int id = sc.nextInt();
		System.out.println("Enter the sweet");
		String sweetname = sc.next();
		statement.setInt(1, id);
		statement.setString(2, sweetname);
		statement.setDouble(3, 50);
		statement.setInt(4, 1);
		int executeUpdate = statement.executeUpdate();
		System.out.println(executeUpdate);
		
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
}
