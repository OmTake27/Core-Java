package com.nacs.logicalprograms.main;

import com.nacs.logicalprograms.Factorial;

public class MainFactorial {

	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		
		for (int i=1;i<=100;i++) {
			factorial.setNumber(i);
		
		factorial.setNumber(i);
	    float tempFact = factorial.calculateFactorial();
		System.out.println("Factorial of :" + factorial.getNumber() + " is = " + tempFact);
	}}

}
