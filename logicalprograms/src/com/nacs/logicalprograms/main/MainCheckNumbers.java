package com.nacs.logicalprograms.main;

import com.nacs.logicalprograms.CheckNumbers;

public class MainCheckNumbers {
	public static void main(String[] args) {
		CheckNumbers checkNumber = new CheckNumbers();

		// Check perfect numbers from 1 to 10
		for (int i = 1; i <= 10000; i++) {
			checkNumber.setNumber(i);
			if (checkNumber.isPerfect())
				System.out.println(i + " is a perfect number");
			// else
			// System.out.println(i + " is not a perfect number");
		}
		System.out.println("\n");
		checkNumber.setNumber(123);
		System.out.println("Reverse of 123 is: " + checkNumber.getReverseNumber());
		System.out.println("\n");
		checkNumber.setNumber(152);
		if (checkNumber.isPalindrome())
			System.out.println("152 is a palindrome number");
		else
			System.out.println("152 is not a palindrome number");
		System.out.println("\n");
		checkNumber.setNumber(121);
		if (checkNumber.isPalindrome())
			System.out.println("121 is a palindrome number");
		else
			System.out.println("121 is not a palindrome number");
		System.out.println("\n");
		checkNumber.setNumber(17);
		if (checkNumber.isPrime())
			System.out.println(17 + " is a Prime number");
		else
			System.out.println(17 + " is a not prime number");
		System.out.println("\n");
		checkNumber.setNumber(4);
		if (checkNumber.isPrime())
			System.out.println(4 + " is a Prime number");
		else
			System.out.println(4 + " is a not Prime number");
		for(int i=1;i<=1000;i++) {
		checkNumber.setNumber(i);
		if (checkNumber.isArmstrong())
			System.out.println(i + " is a Armstrong number");
//		else
//			System.out.println(152 + " is a not Armstrong number");
		
		}

	}
}
