package com.te.array_practise1;

public class OtherMethods {
	public static void main(String[] args) {
		String s = "My name is Vivek Gowda HR";
		String v = " And I am from Mysore";
		System.out.println(s);
		System.out.println(s.charAt(5));// it will give me the letter which number i have put
		System.out.println(s.concat(v));// join two string
		System.out.println(v.indent(6));// it gives the space in the string
		System.out.println(s.equals(v));// equating two string based of content in the string
		System.out.println(v.repeat(2));// it will repeat the array which we have to declared and time we gave
		System.out.println(s.replaceAll(v, s.concat(v)));// replacing one array with other

	}
}
