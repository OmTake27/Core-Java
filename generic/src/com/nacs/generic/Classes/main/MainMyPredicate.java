package com.nacs.generic.Classes.main;

import com.nacs.generic.Classes.MyPredicate;

public class MainMyPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPredicate<Integer> oddOrEven = number -> number % 2 == 0;
		if (oddOrEven.MyTest(100)) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

	}

}
