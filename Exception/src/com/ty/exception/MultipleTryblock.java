package com.ty.exception;

import java.util.Scanner;

public class MultipleTryblock
{
	public static void main(String[] args) {
		int x, y;
		System.out.println("enter the number 1");
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		System.out.println("enter the second number");
		y = scan.nextInt();
		try {
			int result = x / y;// arithmetic ex
			int[] arr=new int [result];
			arr[4]=50;//arrayindexoutofbond
			System.out.println(arr[4]);//50
			System.out.println(result);//10
//catch(RuntimeException e){
			//RuntimeException e=new arithmeticException();
			//RuntimeException e=new ArrayIndexOutOfBond();
			//System.out.println("Exception occured");
		//}
		} catch (ArithmeticException e) {
			System.out.println("Enter the valid number");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The size of array is smaller than 4");
		}
		

	}
}


