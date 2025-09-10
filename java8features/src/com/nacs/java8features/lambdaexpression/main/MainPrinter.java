package com.nacs.java8features.lambdaexpression.main;

import com.nacs.java8features.lambdaexpression.Printer;

public class MainPrinter {

	public static void main(String[] args) {
		Printer stringPrinter = data -> {  //single parameters their  no (),double parametre their use ()
			System.out.println(data);
		};
		stringPrinter.printData("NACS");
	}

}
