package com.te.array;

import java.util.Iterator;

public class Sorting {
	public static void main(String[] args) 
	{
		int [] a= {10,800,30,58,932,-258,2589};
		int sort=a[0];
		for (int i = 0; i < a.length; i++) 
		{for (int j = 0; j < a.length; j++) {
			
		
			if (a[j]<a[i]) {
				sort=a[i];
			a[i]=a[j];
			a[j]=sort;
			
			}		
		}
	}
		for (int i = 0; i < a.length; i++) {
			System.out.println( +a[i]);
		}
		
		int b=a[a.length-7];
		System.out.println("The largest number is "+b);
	}
	}
