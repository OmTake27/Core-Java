package com.nacs.java8features.Streamapi;

import java.util.*;
import java.util.stream.Stream;

class Employee {
    private int id;
    private String name;
    private String address;
    private Float salary;
    private String department;

    public Employee(int id, String name, String address, Float salary, String department) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.department = department;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getAddress() { return address; }
    public Float getSalary() { return salary; }
    public String getDepartment() { return department; }

    @Override
    public String toString() {
        return id + " | " + name + " | " + address + " | " + salary + " | " + department;
    }

    // ✅ Needed for distinct()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee emp = (Employee) o;
        return id == emp.id &&
               Objects.equals(name, emp.name) &&
               Objects.equals(address, emp.address) &&
               Objects.equals(salary, emp.salary) &&
               Objects.equals(department, emp.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, salary, department);
    }
}

public class MainEmployee {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee(1, "Shruti", "Delhi Gate", 40000F, "HR"),
            new Employee(2, "Sakshi", "Pipeline Road", 35000F, "Developer"),
            new Employee(3, "Sakshi", "Maliwada", 21000F, "Accounts"),
            new Employee(4, "Shraddha", "Professor Chowk", 40000F, "HR"),
            new Employee(5, "Pranjal", "Maliwada", 30000F, "Developer"),
            new Employee(6, "Pranali", "Maliwada", 43000F, "HR"),
            new Employee(7, "Sakshi", "Market Yard", 50000F, "Manager"),
            new Employee(8, "Sakshi", "Saras Nagar", 42000F, "HR"),
            new Employee(9, "Babita", "Dsp Chowk", 33000F, "Developer"),
            new Employee(10, "Priyanka", "SBI Chowk", 40000F, "Accounts"),
            new Employee(11, "Kajal", "Maliwada", 35000F, "Developer"),
        };

        // 1️⃣ Sort employees by department
        try (Stream<Employee> empStream = Arrays.stream(employees)) {
            System.out.println("\n1️⃣ Sorted by Department:");
            empStream.sorted(Comparator.comparing(Employee::getAddress))
                     .forEach(System.out::println);
        }

        // 2️⃣ Unique employee records
        try (Stream<Employee> empStream = Arrays.stream(employees)) {
            System.out.println("\n2️⃣ Unique Employees:");
            empStream.distinct().forEach(System.out::println);
        }

        // 3️⃣ Get name array of developers
        try (Stream<Employee> empStream = Arrays.stream(employees)) {
            System.out.println("\n3️⃣ Names of Developers:");
            String[] developerNames = empStream
                    .filter(e -> e.getDepartment().equalsIgnoreCase("Developer"))
                    .map(Employee::getName)
                    .toArray(String[]::new);
            System.out.println(Arrays.toString(developerNames));
        }

        // 4️⃣ Get unique department array
        try (Stream<Employee> empStream = Arrays.stream(employees)) {
            System.out.println("\n4️⃣ Unique Departments:");
            String[] uniqueDepartments = empStream
                    .map(Employee::getDepartment)
                    .distinct()
                    .toArray(String[]::new);
            System.out.println(Arrays.toString(uniqueDepartments));
        }

        // 5️⃣ Get highest salary from Maliwada
        try (Stream<Employee> empStream = Arrays.stream(employees)) {
            System.out.println("\n5️⃣ Highest Salary from Maliwada:");
            empStream.filter(e -> e.getAddress().equalsIgnoreCase("Maliwada"))
                     .max(Comparator.comparing(Employee::getSalary))
                     .ifPresent(System.out::println);
        }
    }
}
