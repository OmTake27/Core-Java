package com.nacs.java8features.lambdaexpression.main;

import com.nacs.java8features.lambdaexpression.lengthCalculator;

public class MainlengthCalculator {
	public static void main(String[] args) {
		lengthCalculator LenghtCalculator =(str)->{
			 return str.length();
	};
	int result=LenghtCalculator.calculateLength("om_take");
	System.out.println(result);
	}
}
