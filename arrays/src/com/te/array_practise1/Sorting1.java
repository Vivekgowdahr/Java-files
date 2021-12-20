package com.te.array_practise1;

public class Sorting1 {
public static void main(String[] args) {
	int [] a= {10,20,30,40,50,98,73,15,75,14,75,36,95,85,78};
	int temp;
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			if (a[i]<a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	System.out.println();
	System.out.println(a[a.length-1]);
}
}
