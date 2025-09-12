package com.nacs.stringclasses.string;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sB = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			sB.append(i);
		}
		System.out.println(sB.toString());
	}

}
