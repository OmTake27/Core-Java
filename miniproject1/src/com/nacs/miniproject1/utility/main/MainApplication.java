package com.nacs.miniproject1.utility.main;

import java.util.Scanner;

import com.nacs.miniproject1.utility.DataTypeProgramUtility;
import com.nacs.miniproject1.utility.LogicalProgramUtility;
import com.nacs.miniproject1.utility.OperatorProgramUtility;

public class MainApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
         char ch='\u0C68';
        do {
        	
            choice = printMenu(scanner);
            switch (choice) {
                case 1 -> {
                    System.out.println("Execute logical program..");
                    LogicalProgramUtility logicalUtility = new LogicalProgramUtility();
                    logicalUtility.printLogicalProgramMenu(scanner); // ✅ Correct method
                }
                case 2 -> {
                    System.out.println("Execute data type program..");
                    DataTypeProgramUtility dataUtility = new DataTypeProgramUtility();
                    
                    dataUtility.printDataTypeMenu(scanner); // if exists
                }
                case 3 -> {
                    System.out.println("Execute Operator program");
                    OperatorProgramUtility operatorUtility = new OperatorProgramUtility();
                    operatorUtility.printOperatorProgramMenu(scanner); // if exists
                }
                case 0 -> {
                    System.out.println("bye... bye...");
                }
                default -> System.out.println("Invalid INPUT");
            }
        } while (choice != 0);

        scanner.close();
    }

    public static int printMenu(Scanner scanner) {
    	 char ch='\u0C68';
         System.out.println(ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" ");

        System.out.println("1. Logical Program");
        System.out.println("2. Data type Program");
        System.out.println("3. Operators Program");
        System.out.println("0. Exit");
        System.out.println(ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" "+ch+" ");
        System.out.print("Enter choice: ");
        
        return scanner.nextInt();
    }
}
