package com.nacs.oops.abstractions;

public interface ArithematicOperation {
	public static final int demoVariable=10;
	public abstract int addition(int number1,int number2);
	public abstract int substraction(int number1,int number2);
	public abstract int mulitplication(int number1,int number2);
	public abstract int division(int number1,int number2);
	public static int modulo(int number1 ,int number2) {
		return decrementByOne(number1);
		//return number1%number2;	
	}
	//static mwthod are allowed int InterFace after java 1.8 SE version
	public default int incrementbyOne(int operand1) {
		return ++operand1;
	}
   private static int decrementByOne(int operand2) {
	   return --operand2;
   }
   public default int testDecrementByone(int operand3) {
	   return decrementByOne(operand3);
   }

	

}
