package com.nacs.logicalprograms;

public class LoopingStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int table = 5;
		for (int i = 1; i <= 10; i++)
			System.out.println(table + " * " + i + " = " + (table * i));

		int number = 50;
		while (number != 0) {
			number = number / 2;
			System.out.println(number);
		}

	}
}
