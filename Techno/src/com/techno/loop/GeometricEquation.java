package com.techno.loop;
import java.util.Iterator;
import java.util.Scanner;
public class GeometricEquation 
{
public static void main(String[] args) 
{
Scanner z=new Scanner(System.in);
System.out.println("Enter the value of A");
double a=z.nextInt();


Scanner y =new Scanner(System.in);
System.out.println("Enter the value of B");
int b=y.nextInt();

Scanner u=new Scanner(System.in);
System.out.println("Enter the value of N");
int n=u.nextInt();


for (int i = 0; i <=n; i++) 
{
	a=a+(Math.pow(2, i)*b);
	
	System.out.println("The reselt "+a);
}
//sum =a+(n
}
}
