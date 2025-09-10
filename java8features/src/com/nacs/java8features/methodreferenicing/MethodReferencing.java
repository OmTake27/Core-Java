package com.nacs.java8features.methodreferenicing;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

import com.nacs.java8features.entities.Student;

public class MethodReferencing {
	private static int rollNo;

	public static void main(String[] args) {

//        Consumer<String> printer = System.out::println;
//        printer.accept("Om");
//
//        
//        Function<String, Integer> strLength = String::length;
//        System.out.println(strLength.apply("om"));
//
//       
//        String[] names = {"om", "mahesh"};
//        Function<String, String> toUpper = MethodReferencing::toUpper;
//
//        for (String name : names) {
//            System.out.println(toUpper.apply(name));
//        }
//
//        
//        MethodReferencing obj = new MethodReferencing();
//        //IntPredicate evenOrOdd = number->obj.isEven(number);
//        IntPredicate evenOrOdd=obj::isEven;
//
//        if (evenOrOdd.test(10)) {
//            System.out.println("10 is an even number");
//        } else {
//            System.out.println("10 is an odd number");
//        }
//    }
//
//    public static String toUpper(String str) {
//        return str.toUpperCase();
//    }
//
//    public boolean isEven(int number) {
//        return number % 2 == 0;
//    }
//		
		Consumer<Student> printRollNo = Student::printRollNo;
		Consumer<Student> printName = Student::printName;
		Consumer<Student> printAll = printRollNo.andThen(printName);
		Student student5= new Student(107,"yash");
		printAll.accept(student5);
		
		
		
		
		
	}
	
	
}
