package com.te.array_imp_program;

import java.util.Iterator;
import java.util.Scanner;

public class EvenOddAdding {
	public static void main(String[] args) {
		int[] a = { 10, 11, 12, 13, 14, 1, 3, 15, 2, 16, 17, 0 };
		System.out.println("odd numbers are :");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) 
				System.out.println(a[i] + " :is odd");
			else
				System.out.println(a[i] + " : is even");
		}
	}

}
