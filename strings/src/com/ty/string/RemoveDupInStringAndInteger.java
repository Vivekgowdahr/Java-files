package com.ty.string;

import java.util.Iterator;
import java.util.Scanner;

public class RemoveDupInStringAndInteger {
	public static void main(String[] args) {
//Scanner scanner = new Scanner(System.in);00331-10000-00001-AA915
		String s = "vivek";
char[] a = s.toCharArray();
		//int []a= {10,50,10,63,63,59,25,63,25,25};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j]) {

					char temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					
				}

			}

		}
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {
				System.out.println(a[i]);
			}

		}
		System.out.println(a[a.length-1]);
	}
}