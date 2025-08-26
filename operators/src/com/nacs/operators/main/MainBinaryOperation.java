package com.nacs.operators.main;

import com.nacs.operators.UnaryOperation;
import com.nacs.operators.BinaryOperation;
import com.nacs.operators.BitwiseShiftOperation;

public class MainBinaryOperation {
	public static void main(String[] args) {
//		BinaryOperation addition = new BinaryOperation();
//		addition.setOperand1(10);
//		addition.setOperand2(20);
//		int additionResult = addition.addTwoNumber();
//		System.out.println("addition result for" + addition.getOperand1() + "and" + addition.getOperand2() + "= "
//				+ additionResult);
//
//		BinaryOperation substraction = new BinaryOperation();
//		substraction.setOperand1(10);
//		substraction.setOperand2(additionResult);
//		int substractionResult = substraction.subtractOperand1FormOperand2();
//		System.out.println("subctraction result for" + substraction.getOperand1() + "and" + substraction.getOperand2()
//				+ "= " + substractionResult);
//
//		UnaryOperation unaryOperation = new UnaryOperation();
//		unaryOperation.postIncrementByOne();
//		int temp = unaryOperation.getOperand1();
//		System.out.println(temp); 
          BitwiseShiftOperation shiftOperation = new BitwiseShiftOperation(-41);
          System.out.println(shiftOperation.leftShiftWithPosition(2));
          System.out.println(shiftOperation.RightShiftWithPosition(2));
          System.out.println(shiftOperation.UnsignedRightShiftWithPosition(3));
   
	}
}
