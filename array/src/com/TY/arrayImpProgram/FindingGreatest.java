package com.TY.arrayImpProgram;

import java.util.Iterator;

public class FindingGreatest 
{
public static void main(String[] args)
{
	int []a= {10,20,30,45,221,-58,85269};
	int s=a[0];
	for (int i = 0; i < a.length; i++) 
	{
		if (s<a[i]) 
		{
			s=a[i];
			
		}
		System.out.println((a.length-1));
	}
	System.out.println(s);
}
}
