package com.nacs.arrays.arraydemo;

import java.util.Scanner;

public class ShalowCopyDemo {
//shalow copy-by using call value and call by reference
	public static void main(String[] args) {   //In heap area intize the array reference
		//one memeory address refernce many or multiple object
		// TODO Auto-generated method stub
		int[] array1= {1,2,3,4,5};
		int[] array2=array1;
		addTen(array1);
		for(int i=0;i<array1.length;i++) {
			System.out.print(array1[i]+ " ");
		}
		// TODO Auto-generated method stub
				int[] array3= {1,2,3,4,5};
				int[] array4=new int[5];
				addTen(array3);
				for(int i=0;i<array3.length;i++) {
					array3[i]=array3[i];
				}
//
				//
				//
				///
				/////
				///
				///
				///
				///
 Scanner scanner= new Scanner(System.in);
 useScanner(scanner);
 int data=10;
 usePrimitive(data);//call by reference
 scanner.close();
	}
	public static void addTen(int... array) {
		for(int i=0;i<array.length;i++) {
			array[i]+=10;
		}
		
	}
public static void useScanner(Scanner scanner) {
	System.out.println("Enter the name");
	System.out.println(scanner.next());
	
}
public static void  usePrimitive(int data) {
	data+=10;
}
}
