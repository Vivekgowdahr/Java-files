package com.TE.Exception;

public class CustomeException 
{
public void happen() throws Blocked{

	System.out.println("Hello, Kutti");
	throw new Blocked("Your not eligibale to be my soulmate kutti.");
}
public static void main(String[] args) {
	CustomeException customeException=new CustomeException();
	try {
		customeException.happen();
	}
		catch (Blocked e) 
	{
			System.out.println(e.message);
		}
	}
}

