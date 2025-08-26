
package com.nacs.miniproject1.utility;

import java.util.Scanner;
import com.nacs.datatypes.typecasting.TypeCasting;

public class DataTypeProgramUtility {

    public void printDataTypeMenu(Scanner scanner) {
        int choice = 0;
        char ch='\u0C68';

        do {
            choice = displayMenu(scanner);
            switch (choice) {
                case 1 -> wideningToFloat(scanner);
                case 2 -> narrowingToChar(scanner);
                case 0 -> System.out.println("Exiting Data Type Programs... Goodbye");
                default -> System.out.println("Invalid input. Please try again.");
            }
        } while (choice != 0);
    }

    private int displayMenu(Scanner scanner) {
        char ch='\u0C68';

        System.out.println("\n===== Data Type Programs Menu =====");
        System.out.println("1. Widening (char → float)");
        System.out.println("2. Narrowing (int → char)");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        System.out.println(ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" ");
        return scanner.nextInt();
    }

    private void wideningToFloat(Scanner scanner) {
        char ch='\u0C68';

        TypeCasting typeCasting = new TypeCasting();
        System.out.print("Enter a character to type cast into float: ");
        typeCasting.widening(scanner.next().charAt(0));
        System.out.println("Float result is: " + typeCasting.getNumber());
        System.out.println(ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" ");
    }

    private void narrowingToChar(Scanner scanner) {
        char ch='\u0C68';

        TypeCasting typeCasting = new TypeCasting();
        System.out.print("Enter a number to type cast into char: ");
        typeCasting.narrowingToChar((char) scanner.nextInt());
        System.out.println("Char result is: " + typeCasting.getCharVariable());
        System.out.println(ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" ");
    }
}
