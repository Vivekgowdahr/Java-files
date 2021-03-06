package com.te.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class CreateTable {
public static void main(String[] args) {
	Connection connection=null;
	Statement createStatement=null;
	//1st load the driver
	try {
	
	Driver driver = new Driver();
	DriverManager.registerDriver(driver);//only driver class is the one which will connect the java and sql
	//2nd create a connection
	connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo?user=root&password=Vivekgowda@1998");
	
	// creating a platform (staements)
	 createStatement = connection.createStatement();
	
	//execute query
	createStatement.execute("create table Sweets(id int,name varchar(40),cost double, quantaty double)");
	}catch (SQLException e) {
		e.printStackTrace();
	}
	finally {
		if (connection!=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (createStatement!=null) {
			try {
				createStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
}
