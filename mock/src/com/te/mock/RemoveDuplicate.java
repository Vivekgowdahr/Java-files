package com.te.mock;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String s1 = "Welcome to techno";
		char []a=s1.toCharArray();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=(char) temp;
				}
			}
		}
		for (int i = 0; i < a.length-1; i++) {
			if (a[i]!=a[i+1]) {
				System.out.println(a[i]);
			}
		}
	}
}