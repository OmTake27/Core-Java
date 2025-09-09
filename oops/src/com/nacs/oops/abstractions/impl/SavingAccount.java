package com.nacs.oops.abstractions.impl;

import com.nacs.oops.abstractions.BankAccount;

public class SavingAccount extends BankAccount {
	
	public SavingAccount() {
		super(1500);
	}

	public SavingAccount(float balance) {
		super(balance);
	}

	@Override
	public void debit(float amount) {
		if(checkbalance()-amount>0) {
			setBalance(getBalance()-amount);
			System.out.println("Amount Debited :" +amount);
			
		}
		else {
			System.out.println("Insufficient balance");
		}

	}

	@Override
	public void credit(float amount) {
		setBalance(getBalance()+ amount);

	}
}
