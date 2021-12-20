package com.te.threadclass;

public class Main {
public static void main(String[] args) throws InterruptedException {
	Account account = new Account(1000);
	BoyFriend boyFriend = new BoyFriend(account);
	GirlFriend girlFriend = new GirlFriend(account);
	boyFriend.start();
	girlFriend.start();
	
	boyFriend.join();
	girlFriend.join();
	
	System.out.println("wait completed");
	account.checkBalance();
}
}
