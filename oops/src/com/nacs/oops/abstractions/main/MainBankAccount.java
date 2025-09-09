package com.nacs.oops.abstractions.main;

import com.nacs.oops.abstractions.BankAccount;
import com.nacs.oops.abstractions.impl.SavingAccount;

public class MainBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account1 = new SavingAccount(50000);
	System.out.println(	" The balance is :"+account1.getBalance());
	account1.debit(1000);
	System.out.println(	" The balance is :"+account1.getBalance());
	account1.credit(100000);
	System.out.println(	" The balance is :"+account1.getBalance());

	}

}
