package com.bank.account;

public class Account {

	private int balance = 0;

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void deposite(int deposite) {
		int total = getBalance() + deposite;
		// this.balance = total;
		setBalance(total);
	}

	public void withdrawal(int withdrawal) {
		
		int amount = getBalance() - withdrawal;
		
		if (amount >= 2000) {
			
			balance = getBalance() - withdrawal;
			
			System.out.println("Balance after withdrawal = " + balance);
			
		} else {
			System.err.println("Insufficient Funds");
		}
	}

}
