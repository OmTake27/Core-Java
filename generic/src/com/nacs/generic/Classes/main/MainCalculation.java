package com.nacs.generic.Classes.main;

import com.nacs.generic.Classes.Calculation;

public class MainCalculation {
	public static void main(String[] args) {
		Calculation<Integer> intCalculation = new Calculation<>();
		double result = intCalculation.addd(10, 20);
		System.out.println(result);
		Calculation<Float> floatCalculation = new Calculation<>();
		double result1 = floatCalculation.addd(10.00F, 20.23F);
		System.out.println(result1);
	}

}
