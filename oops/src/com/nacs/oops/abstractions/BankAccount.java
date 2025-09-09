package com.nacs.oops.abstractions;

public abstract class BankAccount {
	private float balance;

	private BankAccount() {

	}

	public BankAccount(float balance) {
		this.balance = balance;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public abstract void debit(float amount);

	public abstract void credit(float amount);

	public float checkbalance() {
		return balance;
	}

	
}
