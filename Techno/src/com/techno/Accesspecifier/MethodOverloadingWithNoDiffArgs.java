package com.techno.accesspecifier;

public class MethodOverloadingWithNoDiffArgs
{
	public void login(String username,String password)
	{
		System.out.println("your username "+username);
		System.out.println("your password"+password);
	}
	public void login(long MobileNumber,String password)
	{
		System.out.println("your MobileNumber "+MobileNumber);
		System.out.println("your password "+password);
	}
	public static void main(String[] args)
	{
		MethodOverloadingWithNoDiffArgs obj= new MethodOverloadingWithNoDiffArgs();
		obj.login(8147309710l, "noOneElse");
		obj.login("VivekGowdaHR ", "noOneElse");

	}

}
