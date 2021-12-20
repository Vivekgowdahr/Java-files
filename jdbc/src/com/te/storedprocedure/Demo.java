package com.te.storedprocedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
	String url="jdbc:mysql://localhost:3306/jdbcdemo";
	Connection connection = null;
	CallableStatement callStatement = null;
	try {
		connection=DriverManager.getConnection(url, "root", "Vivekgowda@1998");
		callStatement=connection.prepareCall("call put(?,?,?,?)");
		//Taking the input from the user
		Scanner sca = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the id of the sweet");
			int id=sca.nextInt();
			if (id==0) {
				break;
			}
			System.out.println("Enter the name of the sweet");
			String name=sca.next();
			System.out.println("Enter the cost of the sweet");
			Double cost=sca.nextDouble();
			System.out.println("Enter the quantity");
			int kg=sca.nextInt();
			
			//assigning the values of table
			callStatement.setInt(1, id);
			callStatement.setString(2, name);
			callStatement.setDouble(3, cost);
			callStatement.setInt(4, kg);
			
			//exicute the statement
			callStatement.execute();
			
			
		}
	} catch (Exception e) {
e.printStackTrace();	}
}
}
