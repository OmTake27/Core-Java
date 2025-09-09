package com.nacs.oops.abstractions.impl;

import com.nacs.oops.abstractions.ArithematicOperation;

public  class ArithematicOperationImpl implements ArithematicOperation {
	@Override
	public int addition(int number1,int number2) {
		return number1+number2;
	}
	@Override
	public int substraction(int number1,int number2) {
		return number1-number2;
	}
	@Override
	public int mulitplication(int number1,int number2) {
		return number1*number2;
	}
	@Override
	public int division(int number1,int number2) {
		return number1*number2;
	}
	@Override
	public int incrementbyOne(int operand1) {
		return ++operand1;
	}
	@Override
	public int testDecrementByone(int operand3) {
		   return testDecrementByone(operand3);
	   }
}
