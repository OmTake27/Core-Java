package com.nacs.java8features.lambdaexpression.main;

import com.nacs.java8features.lambdaexpression.CheckNumber;


public class MainCheckNumber {

	public static void main(String[] args) {
		CheckNumber checknumber = (number) -> {
			for (int i = 2; i * i <= number; i++) {
				if (number % i == 0) {
					return false;
				}
			}
			return true;
		};
		boolean result =checknumber.IsPrime(23);
		System.out.println(result);
		
		for(int i=0;i<=1000;i++) {
		if(checknumber.IsPrime(i)) {
			System.out.println(i+" : is prime Number");
		}
//		else
//		{
//			System.out.println("is not prime Number");
//			
//		}
		}

	}

}
