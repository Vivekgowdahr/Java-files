package com.techno.loop;
import java.util.Scanner;
public class Table2 
{
public static void main(String[] args) 
{
	{
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the table you want");
	int a=obj.nextInt();
	System.out.println("Enter the range you need");
	int n=obj.nextInt();
	int c=0;
	for (int i =1; i <=10;i++)
	{
		int b=i*a;
		System.out.println(a+"x"+i+"="+b);
		
		
     if (b==n) 
     {
    	 c=c+b;
    	 System.out.println("the sum is "+c);
		break;
		}
     else 
     
		System.out.println();
	
     
		}
		
	}
		
		//if (condition) {
			
		//} 
		//else {

		//}
		
}
		
}
