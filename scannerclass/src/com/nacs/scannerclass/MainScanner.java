package com.nacs.scannerclass;

import java.util.Scanner;

public class MainScanner {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
//		System.out.print(" Enter a Number\n\t ");
//		 byte var1=scanner.nextByte();
//		 System.out.println("Enter boolean data: \t\n");
//		 boolean flag = scanner.nextBoolean();
//		 System.out.println("flag =" +flag);
//		 System.out.println(var1);
//		 System.out.println("Enter Your Name\n\t");
//		 String name=scanner.next();
//		System.out.println("Name ="+name);
//		System.out.println("\t\n");
//		 System.out.println("Enter Your full Name\t\n");
//		 String name1=scanner.nextLine();
//		 System.out.println("My full name is  ="+name1);
		 System.out.println("Enter an Gender as male or female:");
		 char gender = scanner.next().charAt(0);
		 System.out.println("Gender =" +gender);
		scanner.close();
	}

}
