package com.nacs.exceptions.basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tryCatchFinally {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printData(scanner, 3);
        scanner.close();  // ✅ Only close once here
    }

    public static void printData(Scanner scanner, int attempts) {
        int number = 0;
        System.out.println("Enter Integer Number :: Remaining attempts " + attempts);

        try {
            number = scanner.nextInt();
            System.out.println("You entered: " + number);

        } catch (InputMismatchException e) {
            scanner.next(); // ✅ consume invalid token
            System.out.println("Invalid input. " + e);

            if (attempts > 1) {
                printData(scanner, attempts - 1);  // recursive call
            } else {
                System.out.println("No attempts left!");
            }

        } finally {
            System.out.println("This is Finally Block.. (attempts left: " + (attempts - 1) + ")");
            // ❌ Don't close scanner here, let main handle it
        }
    }
}
