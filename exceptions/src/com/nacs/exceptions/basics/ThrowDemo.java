package com.nacs.exceptions.basics;

public class ThrowDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
demoMethod();
	}
	public static void demoMethod() throws Exception {
		throw new Exception(" Not Divide by Zero");
	}

}
