package com.nacs.miniproject1.utility;

import java.util.Scanner;
import com.nacs.logicalprograms.CheckNumbers;
import com.nacs.logicalprograms.PatternPrinting;

public class LogicalProgramUtility {

    public void printLogicalProgramMenu(Scanner scanner) {
        int choice = 0;
        char ch='\u0C68';
        do {
        	
            choice = printMenu(scanner);
            switch (choice) {
                case 1 -> checkPerfectNumber(scanner);
                case 2 -> checkPrimeNumber(scanner);
                case 3 -> checkArmstrongNumber(scanner);
                case 4 -> checkPalindromeNumber(scanner);
                case 5 -> printSquare(scanner);
                case 6 -> printTriangle(scanner);
                case 0 -> System.out.println("Exiting Logical Programs... Goodbye!");
                default -> System.out.println("⚠ Invalid Input. Please try again.");
            }
        } while (choice != 0);
    }

    private void checkPerfectNumber(Scanner scanner) {
    	 char ch='\u0C68';
    	
        CheckNumbers checkNumber = new CheckNumbers();
        System.out.print("Enter a number to check if it is PERFECT: ");
        checkNumber.setNumber(scanner.nextInt());
        if (checkNumber.isPerfect())
            System.out.println("✅ " + checkNumber.getNumber() + " is a Perfect Number.");
        else
            System.out.println("❌ " + checkNumber.getNumber() + " is NOT a Perfect Number.");
        System.out.println(ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" ");
    }

    private void checkPrimeNumber(Scanner scanner) {
    	 char ch='\u0C68';
    	
        CheckNumbers checkNumber = new CheckNumbers();
        System.out.print("Enter a number to check if it is PRIME: ");
        checkNumber.setNumber(scanner.nextInt());
        if (checkNumber.isPrime())
            System.out.println("✅ " + checkNumber.getNumber() + " is a Prime Number.");
        else
            System.out.println("❌ " + checkNumber.getNumber() + " is NOT a Prime Number.");
        System.out.println(ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" ");
    }

    private void checkPalindromeNumber(Scanner scanner) {
    	 char ch='\u0C68';
    	
        CheckNumbers checkNumber = new CheckNumbers();
        System.out.print("Enter a number to check if it is PALINDROME: ");
        checkNumber.setNumber(scanner.nextInt());
        if (checkNumber.isPalindrome())
            System.out.println("✅ " + checkNumber.getNumber() + " is a Palindrome Number.");
        else
            System.out.println("❌ " + checkNumber.getNumber() + " is NOT a Palindrome Number.");
        System.out.println(ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" ");
    }

    private void checkArmstrongNumber(Scanner scanner) {
    	 char ch='\u0C68';
    	
        CheckNumbers checkNumber = new CheckNumbers();
        System.out.print("Enter a number to check if it is ARMSTRONG: ");
        checkNumber.setNumber(scanner.nextInt());
        if (checkNumber.isArmstrong())
            System.out.println("✅ " + checkNumber.getNumber() + " is an Armstrong Number.");
        else
            System.out.println("❌ " + checkNumber.getNumber() + " is NOT an Armstrong Number.");
        System.out.println(ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" ");
    }

    private void printSquare(Scanner scanner) {
    	 char ch='\u0C68';
    	
        PatternPrinting patternPrint = new PatternPrinting();
        System.out.print("Enter number of rows for the Square: ");
        patternPrint.setRow(scanner.nextInt());
        System.out.println("🔷 Printing Square Pattern:");
        patternPrint.printSquare();
        System.out.println(ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" ");
    }

    private void printTriangle(Scanner scanner) {
    	 char ch='\u0C68';
    	
        PatternPrinting patternPrint = new PatternPrinting();
        System.out.print("Enter number of rows for the Triangle: ");
        patternPrint.setRow(scanner.nextInt());
        System.out.println("🔺 Printing Triangle Pattern:");
        patternPrint.printPyramidPatternTriangle();
        System.out.println(ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" ");
    }

    private int printMenu(Scanner scanner) {
    	 char ch='\u0C68';
        System.out.println("\n===== Logical Programs Menu =====");
        System.out.println("1. Perfect Number");
        System.out.println("2. Prime Number");
        System.out.println("3. Armstrong Number");
        System.out.println("4. Palindrome Number");
        System.out.println("5. Print Square");
        System.out.println("6. Print Triangle");
        System.out.println("0. Exit");
        System.out.println(ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" ");
        System.out.print("Enter your choice: ");
        
        
        return scanner.nextInt();
    }
}
