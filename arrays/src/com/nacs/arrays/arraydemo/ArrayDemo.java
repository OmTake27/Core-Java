package com.nacs.arrays.arraydemo;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
////		int subject1 = 50;
////		int subject2 = 50;
////		int subject3 = 50;
////		int subject4 = 50;
////		int subject5 = 50;
////		subject1 = subject1 + 20;
////		subject2 = subject2 + 20;
////		subject3 = subject3 + 20;
////		subject4 = subject4 + 20;
////		subject5 = subject5 + 20;
//		int[] subjects = new int[5];
//		for (int i = 0; i < 5; i++) {
//			subjects[i] = 50;
//
//		}
//		for(int i=0;i<5;i++) {
//		       subjects[i]=subjects[i]+20;
//		int[] intArray1 = new int[5];
//		int[] intArray11 = {
//				1,2,3
//		};
//		System.out.println(intArray11[0]);
//		System.out.println(intArray11[1]);
//		int[] intArray2=  new int[]{1,2,3};
//		intArray2= new int[5];
		int[] subjects = new int[5];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Element in Array");
		for (int i = 0; i <subjects.length; i++) {
			System.out.println("Enter Mark for subject"+(i+1));

			subjects[i] = scanner.nextInt();
		}
		int totalsum=0;
		for(int i=0;i<subjects.length;i++) {
		totalsum+=subjects[i];}
		
    System.out.println(" This is total mark of subject :"+totalsum);
    float averageMark = totalsum/subjects.length;
    System.out.println("This is Average mark :"+averageMark);

		scanner.close();

	}

}
