package com.te.array;



public class Swapping {
	public static void main(String[] args) {
		int temp;
		int []a= {71,82,39,110,101,312};
		a[0]=a[0]+1;
		a[1]=a[1]-1;
		a[2]=a[2]+1;
		a[3]=a[3]-1;
		a[4]=a[4]+1;
		a[5]=a[5]-1;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
