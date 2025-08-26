package com.nacs.recursion;

public class RecursionDemo {
//static int number = 0;

	public static void main(String[] args) {
		
		System.out.println(print(7));
	}
//
////	public static void print() {
////
////		//System.out.println("Hello");
////		if (number < 5) {
////			
////			number++;// base case
////
////			print(); // Recursion case
////			System.out.println(number);
////		}
////	}
////	public static int print(int number) {
////		if(number>0) 
////			print(number-1);
////		
////		System.out.println(number);
////	}
//
//	
//	public static int print(int number) {
////		if(number<=1) {
////			return 1;
////			
////		}
////		return print(number-1)*number;
//	
//	return(number<=1)?1:print(number-1)*number;
//	}
	public static int print(int number) {
//		if(number==0)
//			return 0;
//		if(number==1)
//			return 1;
//		if(number<=1)
//			return number;
//	  return print(number-1)+print(number-2);
	
		return (number<1)?number:print(number-1)+print(number-2);
	}
}