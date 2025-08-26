package com.nacs.staticandfinal.holidays.main.staticdemo;

import com.nacs.staticandfinal.finaldemo.finalDemo;
import com.nacs.staticandfinal.holidays.Holidays;
import com.nacs.staticandfinal.holidays.main.staticdemo.StaticDemo;

public class MainStaticDemo {
//	private  int number1;
//	private  int number2;
//	static {
//		number = 10;
//		System.out.println("This is Static block{}");
//	}
	static int number;

	public static void main(String[] args) {
		System.out.println("this main  is Block");
		StaticDemo staticDemo = new StaticDemo("om");

		// FinalDemo
		finalDemo demo = new finalDemo();
		System.out.println("Final number: " + demo.getNUMBER());

		// Holidays
		Holidays holiday = new Holidays(1, "Independence Day", "15-08-2025", true, false);
		System.out.println("\nHoliday Details:\n" + holiday);

		// StaticDemo
		StaticDemo emp1 = new StaticDemo("OmTake");
		StaticDemo emp2 = new StaticDemo("Ganesh");
		StaticDemo emp3 = new StaticDemo("Mahesh");

		System.out.println("\nEmployees:");
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);

		// Static method
//		StaticDemo.addNumbers(10, 20);
		MainStaticDemo msDemo = new MainStaticDemo();
		StaticDemo staticDemo1 = new StaticDemo("om");
		StaticDemo staticDemo2 = new StaticDemo("ganesh");
		System.out.println("this is construtor");

//        System.out.println(msDemo.number1);
//      System.out.println(msDemo.number2);

		// Object count
		System.out.println("\nTotal StaticDemo objects created: " + StaticDemo.getObjectCounter());
	}

	public MainStaticDemo() {
		super();
	}
}
