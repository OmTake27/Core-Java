package com.nacs.java8features.functionalinterfaces;

import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainFunctionalInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> predicate = (str) -> str.length() % 2 == 0;
		if (predicate.test("Om")) {
			System.out.println("Om name Contain Even number of Characters");
		} else {
			System.out.println("Om name Contain  Odd number of Characters");
		}
		Predicate<String> containVowels = (str) -> {
			char temp = '0';
			for (int i = 0; i < str.length(); i++) {
				temp = str.toLowerCase().charAt(i);
				if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u') {
					return true;
				}

			}
			return false;
		};
		if (containVowels.test("om")) {
			System.out.println("Name Contain Vowels");
		} else {
			System.out.println("Name  does not Contain Vowels");
		}
		if (containVowels.test("Rhythym")) {
			System.out.println(" Rhythym Name Contain Vowels");
		} else {
			System.out.println(" Rhythym Name does not Contain Vowels");
		}
		Consumer<String> consumer = (str) -> {
			System.out.println(str);
		};
		consumer.accept("om");
		Consumer<String> consumer1 = (str) -> {

			System.out.println(str.length());
		};
		consumer1.accept("Rohan");
		System.out.println();
		int[] intArray = { 1, 2, 3, 4, 5, 6, 7 };
		Consumer<Integer> printInt = number -> System.out.println(number + " = " + number * number);
		for (int i = 0; i < intArray.length; i++) {
			printInt.accept(intArray[i]);
		}
		System.out.println();
		String name = "om";
		Consumer<Character> printChar = ch -> System.out.println(ch);
		for (char ch : name.toCharArray()) {
			printChar.accept(ch);
		}

		Function<Integer, Float> areaOfCircle = radius -> radius * radius * 3.14f;

		System.out.println("Area of circle with radius 5: " + areaOfCircle.apply(10));
		System.out.println();
		Function<String, Integer> strLength = src -> src.length();
		System.out.println(strLength.apply("Hello World"));
		System.out.println();
		// Supplier<Double> randomNumber1=()-> Math.random()*10;
//		Supplier<Integer> randomNumber2 = () -> (int) (Math.random() * 60) % 6;
//		Scanner scanner = new Scanner(System.in);
//		int choice = 0;
//		do {
//			System.out.println("1:continue \n0:exits");
//			choice = scanner.nextInt();
//			switch (choice) {
//			case 1: {
//				System.out.println(randomNumber2.get() + 1);
//				break;
//			}
//			case 0: {
//				System.out.println("bye....");
//				break;
//			}
//			default: {
//				System.out.println("try Again");
//				break;
//			}
//			}
//		} while (choice != 0);
//		scanner.close();
          BinaryOperator<Integer> addition =(number1,number2)->number1+number2;
          System.out.println(addition.apply(20, 30));
//          Consumer<Integer> doubleNumber = number -> System.out.println(number*2);
//          Consumer<Integer> SquareNumber = number -> System.out.println(number*number);
//          Consumer<Integer> doubleandSquare = SquareNumber.andThen(doubleNumber);
//          doubleandSquare.accept(4);
          Function<Integer, Integer> doubleNumber = number -> number * 2;
          Function<Integer, Integer> squareNumber = number -> number * number;

          // First square, then double
          Function<Integer, Integer> doubleAndSquare = squareNumber.andThen(doubleNumber);
          Function<Integer,Integer>squareAndDouble=doubleNumber.andThen(squareNumber);
          Function<Integer,Integer>squareAndDouble1=doubleNumber.compose(squareNumber);
          
          System.out.println(doubleAndSquare.apply(4)+"\n");
          System.out.println(squareAndDouble.apply(4)+"\n");
          System.out.println(squareAndDouble1.apply(4)+"\n");
          Function<Object,Object> obj=Function.identity();
          System.out.println(obj.apply(10+"\nom"));
          
	}

}
