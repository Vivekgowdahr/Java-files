package com.te.array_practise1;

import java.util.Iterator;

public class CountAEIOU {
public static void main(String[] args) {
	String a= "Hi i am from mysore";
	char []b=a.toCharArray();
	int count=0;
	for (int i = 0; i < b.length; i++) {
		if (b[i]=='a'||b[i]=='e'||b[i]=='i'||b[i]=='o'||b[i]=='u') {
			count++;
		}
		
	}
	System.out.println(count);
}

}
