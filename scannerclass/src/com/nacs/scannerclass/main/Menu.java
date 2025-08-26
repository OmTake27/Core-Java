package com.nacs.scannerclass.main;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		do {
//		System.out.println("1. Logical Program");
//		System.out.println("2. Data type Program");
//		System.out.println("3. Operators Program");
//		System.out.println("0. Exit");
			choice = printMenu(scanner);
			switch (choice) {
			case 1 -> System.out.println("Execute logical program..");
			case 2 -> System.out.println("Execute data type program..");
			case 3 -> System.out.println("Execute Operator program");
			case 0 -> System.out.println("bye... bye...");
			default -> System.out.println("Invalid INPUT");
			}
		} while (choice != 0);
		scanner.close();
	}

	public static int printMenu(Scanner scanner) {
		System.out.println("1. Logical Program");
		System.out.println("2. Data type Program");
		System.out.println("3. Operators Program");
		System.out.println("0. Exit");
		return scanner.nextInt();
	}
}
