package com.TechNo.HasARelation;

public class Vivek 
{
	public static void main(String[] args) 
	{
	Processor processor= new Processor("intel111",  4, 2.4);
	HardDisk disk = new HardDisk("WD", 1, "SSD");
	Operatings operatings = new Operatings(64,11, "windows");
Battery Battery = new Battery(3000, "Thosibha", 3);
Laptop Laptop = new Laptop(69999,Battery,operatings,disk,processor);
System.out.println(Laptop);
	}


}
