package com.nacs.logicalprograms.main;

import com.nacs.logicalprograms.SwapTwoNumbers;

public class MainSwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapTwoNumbers swapTwoNumbers1 = new SwapTwoNumbers(10, 20);
		SwapTwoNumbers swapTwoNumbers2 = new SwapTwoNumbers(10, 20);

		System.out.println("Before Swapping Number1 =" + swapTwoNumbers1.getNumber1() + "  and Number2 = "
				+ swapTwoNumbers1.getNumber2());
		swapTwoNumbers1.SwapTwoNumbersUsingThirdVariable();
		System.out.println("After Swapping Number1 =" + swapTwoNumbers1.getNumber1() + "  and Number2 = "
				+ swapTwoNumbers1.getNumber2());
		swapTwoNumbers2.swapTwoNumbersWithOutUsingThirdVariable();
		System.out.println("After Swapping Number1 =" + swapTwoNumbers2.getNumber1() + "  and Number2 = "
				+ swapTwoNumbers2.getNumber2());

	}

}
