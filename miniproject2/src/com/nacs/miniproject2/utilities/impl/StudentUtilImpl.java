package com.nacs.miniproject2.utilities.impl;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.nacs.miniproject2.entitie.Student;
import com.nacs.miniproject2.exceptions.*;
import com.nacs.miniproject2.services.StudentService;
import com.nacs.miniproject2.services.impl.StudentServiceImpl;
import com.nacs.miniproject2.utilities.StudentUtil;

public class StudentUtilImpl implements StudentUtil {

    private StudentService service = new StudentServiceImpl();

    @Override
    public void start(Scanner scanner) {
        int choice;
        do {
            choice = printMenu(scanner, 3);
            switch (choice) {
                case 1 -> pushStudent(scanner, 3);
                case 2 -> popStudent();
                case 3 -> printStack();
                case 0 -> System.out.println("👋 Bye...");
                default -> System.out.println("❌ Invalid Input....");
            }
        } while (choice != 0);
    }

    private int printMenu(Scanner scanner, int attempt) {
        int choice = 0;
        System.out.println("\n📌 MENU");
        System.out.println("1. Push Student");
        System.out.println("2. Pop Student");
        System.out.println("3. Print Stack");
        System.out.println("0. Exit");
        try {
            choice = scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.nextLine();
            if (attempt >= 1) {
                System.out.println("⚠️ Remaining Attempts: " + attempt);
                choice = printMenu(scanner, attempt - 1);
            }
        }
        return choice;
    }

    private void pushStudent(Scanner scanner, int attempt) {
        try {
            Student student = new Student();
            System.out.print("Enter Student Roll No: ");
            student.setRollNo(scanner.nextInt());
            scanner.nextLine();
            
            System.out.print("Enter Student Name: ");
            student.setName(scanner.nextLine().trim());
            
            System.out.print("Enter Student Age: ");
            student.setAge(scanner.nextInt());

            System.out.println(service.pushStudent(student));

        } catch (InvalidStackIndexException | InvalidRollNoException | InvalidNameException | InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            scanner.nextLine();
            if (attempt >= 1) {
                System.out.println("⚠️ Invalid input! Remaining Attempts: " + attempt);
                pushStudent(scanner, attempt - 1);
            }
        }
    }

    private void popStudent() {
        try {
            System.out.println(service.popStudent());
        } catch (InvalidStackIndexException e) {
            System.out.println(e.getMessage());
        }
    }

    private void printStack() {
        System.out.println(service.printStack());
    }
}
