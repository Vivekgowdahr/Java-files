package com.techno.inheritance;

public class Constructor 
{

Constructor()
{
	System.out.println("abc");
}
Constructor(int a,float b)
{
	System.out.println("vcx");
}
Constructor(int a,int b)
{
	System.out.println("poi");
}
public static void main(String[] args) 
{
	new Constructor();
	new Constructor(10,20);
	Constructor d1=new Constructor(10,20f);
	
}
}
