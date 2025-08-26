package com.nacs.staticandfinal.holidays.main.staticdemo;

public class StaticDemo {
	static {
		System.out.println("This is static block");
	}
	
	{
	System.out.println("this is instance");
	}
    private static int objectCounter = 0; // counts all created objects
     static String organizationName = "NACS";
    String employeeName;

    public StaticDemo(String employeeName) {
        this.employeeName = employeeName; 
        objectCounter++; 
    }

    public static void addNumbers(int number1, int number2) {
        System.out.println("Sum: " + (number1 + number2));
    }

    public static int getObjectCounter() {
        return objectCounter;
    }
    public static void printHello() {
    	
    }
    public static void printOrganizationName() {
    	System.out.println(organizationName);
    	printHello();
    }
//
//    @Override
//    public String toString() {
//        return "StaticDemo\nemployeeName=\n" + employeeName +
//               "\n\norganizationName=" + organizationName + " ";
//    }
}
