package com.nacs.exceptions.basics;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionBasicssDemo {

	public static void main(String[] args) {
		// Syntacticly constraint violation
		StringBuilder sb = new StringBuilder();
		int var1 = 0;
		System.out.println(var1);
		//Semantic constraint violation
		//int no= 10/0;
		//String  name=null;
		//String  name1="abc";
		//name.length();
		//name1.charAt(5);
		//int[] intArray= {
			//	1,2,3
		//};
		//intArray[3]=10;
		//Integer intvar =Integer.parseInt("oNE");
		//Integer intvar =Integer.parseInt("99999999999999999999999");
		//Object result ="Name";
		//Integer intResult =(Integer)result;
		//System.out.println(intResult);
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("3 second after");
//		try {
//			FileReader reader = new FileReader("ExceptionBasicssDemo.java");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
////		
//		
//		try {
//			Class.forName("com.example.Demo");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//pauseExecutionFor3Second();
		divideByZero();
		
		
		
		
		
		
		

	}
	public static void divideByZero() {
		
		System.out.println("Method started here...");
		
			int no=10/0;
			
		
		System.out.println("Method ended here...");
	}

}
