package com.TY.arraypractise1;

public class StringToChar {
	public static void main(String[] args) {
		String s = "I wil get above average";// declaring of String
		char[] A = new char[s.length()];// changed string to array
		for (int i = 0; i < s.length(); i++)// for loop iteration
		{
			A[i] = s.charAt(i); // converting from string to char using charAt
		}
		for (char x : A)// Transferring control from A to x
		{
			System.out.println(x);// then printing the transfered control
		}
	}
}