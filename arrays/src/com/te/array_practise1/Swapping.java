package com.te.array_practise1;

public class Swapping {
	public static void main(String[] args) {
		int[] a = { 10, 50, 87, 60, 52, 25, 4, 63, 98, 7 };
		int i = 0;
		int temp;
		while (i < a.length) {
			temp = a[i];
			a[i] = a[i + 1];
			a[i + 1] = temp;
			i += 2;

		}
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j]+" ");
		}
	}
}
