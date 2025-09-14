package com.nacs.exceptions.basics;

public class ThrowsDemo {
	public static void main(String[] args) throws ArithmeticException, InterruptedException{
		divideByZero();
	}
	public static void divideByZero() throws ArithmeticException, InterruptedException {
		//int number =10/0;
		Thread.sleep(3000);
	}

}
