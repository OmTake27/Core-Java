package com.nacs.scannerclass.main;

import java.util.Scanner;
import com.nacs.scannerclass.Employee;

public class MainEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee id: ");
        employee1.setEmployeeId(scanner.nextInt());
        scanner.nextLine(); // consume newline

        System.out.print("Enter Employee Name: ");
        employee1.setEmployeeName(scanner.nextLine());

        System.out.print("Enter Employee Salary: ");
        employee1.setEmployeeSalary(scanner.nextFloat());

        System.out.print("Enter Employee Gender (M/F): ");
        employee1.setEmployeeGender(scanner.next().charAt(0));

        // Display
        System.out.println("\n===== Employee Details =====");
        System.out.println("ID: " + employee1.getEmployeeId());
        System.out.println("Name: " + employee1.getEmployeeName());
        System.out.println("Salary: " + employee1.getEmployeeSalary());
        System.out.println("Gender: " + employee1.getEmployeeGender());

        scanner.close();
    }
}
