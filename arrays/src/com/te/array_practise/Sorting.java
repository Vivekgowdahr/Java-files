package com.te.array_practise;

import java.util.Iterator;

public class Sorting {
	public static void main(String[] args) {

		int[] a = { 3, 18, 17, 11, 45, 99, 7, 1, 10, 8, 12 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println((a[a.length - 2]) + " The 2nd greatest number ");

	}
 } 