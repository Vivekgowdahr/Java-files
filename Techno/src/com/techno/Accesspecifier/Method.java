package com.techno.accesspecifier;

public class Method {

	public void m1()
	{
		System.out.println("public");// can access any class out of package and every ware
	}
	protected void m2()
	{
		System.out.println("protected");//class and package and other package
	}
	void m3()
	{
		System.out.println("default");//only inside that package and class
	}
    private void m4()
    {
    	System.out.println("private"); //only inside the particular class
    }
   
}
