package com.techno.accesspecifier;

import java.util.Scanner;

public class Calculator 
{
public static void addition()
{
	double numberOne ,numberTwo;
	Scanner clc = new Scanner(System.in);
	System.out.println("addition")
	;
	System.out.print("\nFirst Number :");
	numberOne=clc.nextInt();
	
	System.out.println("\nSecond Number :");
	numberTwo=clc.nextInt();
	clc.close();
	System.out.println("\nResult:" +numberOne+"+"+numberTwo+"="+(numberOne+numberTwo));
}
public static void subtraction ()
{
	double numberOne ,numberTwo;
	Scanner clc = new Scanner(System.in);
	System.out.println("subtraction")
	;
	System.out.print("\nFirst Number :");
	numberOne=clc.nextInt();
	
	System.out.println("\nSecond Number :");
	numberTwo=clc.nextInt();
	clc.close();
	System.out.println("\nResult:" +numberOne+"-"+numberTwo+"="+(numberOne-numberTwo));
}
public static void division ()
{
	double numberOne ,numberTwo;
	Scanner clc = new Scanner(System.in);
	System.out.println("division")
	;
	System.out.print("\nFirst Number :");
	numberOne=clc.nextInt();
	
	System.out.println("\nSecond Number :");
	numberTwo=clc.nextInt();
	clc.close();
	System.out.println("\nResult:" +numberOne+"/"+numberTwo+"="+(numberOne/numberTwo));
}
public static void multiplication ()
{
	double numberOne ,numberTwo;
	Scanner clc = new Scanner(System.in);
	System.out.println("multiplication")
	;
	System.out.print("\nFirst Number :");
	numberOne=clc.nextInt();
	
	System.out.println("\nSecond Number :");
	numberTwo=clc.nextInt();
	clc.close();
	System.out.println("\nResul:" +numberOne+"*"+numberTwo+"="+(numberOne*numberTwo));
}
public static void GST ()
{
	double numberOne ,numberTwo;
	Scanner clc = new Scanner(System.in);
	System.out.println("GST")
	;
	System.out.print("\n Enter the percentage of GST :");
	numberOne=clc.nextInt();
	
	System.out.println("\n enter the price of product :");
	numberTwo=clc.nextInt();
	clc.close();
	System.out.println("\nResult:" +numberOne+"-"+numberTwo+"="+(numberTwo+(numberTwo*numberOne/100)));
}
public static void main(String[] args) 
{
	Scanner clc = new Scanner(System.in);
	System.out.println("Calculator");
	System.out.println("1.Addition");
	System.out.println("2.Subtraction");
	System.out.println("3.Division");
	System.out.println("4.Multiplication");
	System.out.println("5.GST");
	
	System.out.print("\nwhat would u like to operate :");
	 int operation = clc.nextInt();
     System.out.println();
     if(operation==1)
     {
    	addition(); 
    	 
     }
     else if(operation==2) 
     {
    	 subtraction();
     }
     else if (operation==3)
     {
    	 division();
     }
     else if(operation==4)
     {
    	 multiplication();
     }
     else if (operation==5)
     {
    	 GST();
     }
	
	System.out.println();
	clc.close();
	
}

}
