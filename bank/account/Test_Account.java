package com.bank.account;

public class Test_Account {

	public static void main(String[] args) {
		
		Account acc = new Account();
		
		acc.setBalance(1000);
		
		acc.deposite(2000);
		
		acc.withdrawal(1000);
	}
}
