package com.te.pver_ridi;

public class OverLoad 
{
public static  void Test() 
{
	System.out.println("1st static test");

}
public static void Test(int x,int y) 
{
	System.out.println("2nd static test");
}
public  void Test(int x,double z) 
{
	System.out.println("3rd instance");
}
public static void main(String[] args)
{
	OverLoad obj = new OverLoad();
	
	obj.Test();
	obj.Test(10,50);
    obj.Test(10,50d);
	}
}
