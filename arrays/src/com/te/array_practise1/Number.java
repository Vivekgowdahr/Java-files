package com.te.array_practise1;

public class Number 
{
	public static void main(String[] args) {
		
	
int [] a= {10,20,900,-62,62,0,0,895};
int s =a[0];
for (int i = 0; i < a.length; i++) 
{
	if (s<a[i]) 
	{
		s=a[i];
	}
}
System.out.println(s);
}
}