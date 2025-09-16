package com.nacs.miniproject2;


import java.util.Scanner;
import com.nacs.miniproject2.utilities.StudentUtil;
import com.nacs.miniproject2.utilities.impl.StudentUtilImpl;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentUtil util = new StudentUtilImpl();
        util.start(scanner);
        scanner.close();
    }
}

