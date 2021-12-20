package com.techno.accesspecifier;

public class ChangingTheNoPara {

		public void add(int x,int y)
		{
			System.out.println(x+y);
		}
		public void add(int x,int y,int z)
		{
			System.out.println(x+y+z);
		}
public static void main(String[] args) 
{
	ChangingTheNoPara obj = new ChangingTheNoPara();
	obj.add(20, 30);
	obj.add(40, 50, 60);
}
	}


