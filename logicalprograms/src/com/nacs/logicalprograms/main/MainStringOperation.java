package com.nacs.logicalprograms.main;

import com.nacs.logicalprograms.StringOperation;

import com.nacs.logicalprograms.StringOperation;

public class MainStringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringOperation stringOperation = new StringOperation();
		stringOperation.setData("apple");
		// stringOperation.reverseData();
		System.out.println(stringOperation.reverseData());
		stringOperation.setData("I am from Laltaki Ahilya Nagar");
		System.out.println(stringOperation.reverseLineOfData());
	}

}
