package com.techno.accesspecifier;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) 
	{
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);	
	
System.out.println("enter year");
int year =sc.nextInt();

if (year%400==0||(year% 100!=0 && year%4 ==0)) 
{
	System.out.println("it is leap year : " + year);
}
else
	System.out.println("not a leap year : " + year);
	
//	//System.out.println("enter month");
//	//int month=new.nextInt();//
//	
//	//if(day==31)
//	//{
//	//	if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12))
//	//	{
//		//	System.out.println("number of ays is 31");
//		}
//		//else if ((month ==2)&& ((year%400==0) || (year%4==0 && year%100!=0)))
//				{
//			System.out.println("number of days is 29");}
//				}
//	//else if(month==2)
//		{
//		System.out.println("number of days are 28");	
//		}
//	//else
//	{
//		System.out.println("number of days is 30");
//		}
	//}
		
	}
	}


