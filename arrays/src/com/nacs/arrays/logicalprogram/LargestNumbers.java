package com.nacs.arrays.logicalprogram;

public class LargestNumbers {
	public static void FindLargestNumber(int[] array) {
		int largest=array[0];
		//int largest=Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++) {
			if(largest<array[i]) {
				largest=array[i];
			}
		}
		System.out.println("The largest number in Array is :" +largest);
	}
	public static void FindFirstSecondLargestNumber(int[] array) {
		int largest=Integer.MIN_VALUE;
		int Secondlargest=Integer.MIN_VALUE;
		//int largest=Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++) {
			if(largest<array[i]) {
				Secondlargest=largest;
				largest=array[i];
			}else if(array[i]<largest&&array[i]>Secondlargest) {
				Secondlargest=array[i];
			}
		}
		System.out.println("The Second largest number in Array is :" +Secondlargest);
	}
	
	

}
