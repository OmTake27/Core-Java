package com.nacs.oops.abstractions.main;

import com.nacs.oops.abstractions.ArithematicOperation;
import com.nacs.oops.abstractions.impl.ArithematicOperationImpl;

public class MainArithematicOperationImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithematicOperation operation1 = new ArithematicOperationImpl();
		int result1 = operation1.addition(10, 20);
		System.out.println("The additon is : "+result1);
		int result2 = ArithematicOperation.modulo(10, 3);

		System.out.println("The modulo is :"+result2);
		ArithematicOperation operation2 = new ArithematicOperationImpl();
		int result3 = operation2.incrementbyOne(10);
		System.out.println("The Incrment is : "+result3);
		System.out.println(ArithematicOperation.demoVariable);
	}

}
