package com.techno.accesspecifier;

public class Mobile 
{
	public static void main(String[] args) 
	{
		Phone phone = new Phone();
		phone.cost=1200;
		phone.color="Hot Pink";
		phone.brand="Kochidan";
		phone.sim=2;
		System.out.println(phone.brand);
		System.out.println(phone.color);
		System.out.println(phone.cost);
		System.out.println(phone.sim);
		phone.call();
		phone.text();
		
		
		SmartPhone smartPhone=new SmartPhone();
		smartPhone.brand="MI";
		smartPhone.cost=12000;
		smartPhone.color="BLUE";
		smartPhone.sim=2;
		System.out.println(smartPhone.brand);
		System.out.println(smartPhone.cost);
		System.out.println(smartPhone.color);
		System.out.println(smartPhone.sim);
		smartPhone.playPubg();
		smartPhone.call();
		smartPhone.text();
		
		
	}

}

