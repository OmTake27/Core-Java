package com.nacs.arrays.logicalprogram;

public class ArrayRotate {
	public static void ArrayRotateLeft(int[] array) {
		int temp=array[0];
		//int largest=Integer.MIN_VALUE;
		for(int i=0;i<array.length-1;i++) {
			 
			array[i]=array[i+1];
		}
		array[array.length-1]=temp;
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+"  ");
		}
		System.out.println();
		//System.out.println("The Second largest number in Array is :" +array);
	}
	public static int[] ArrayRotateRight(int[] array) {
	    int n = array.length;
	    int temp = array[n - 1]; // store last element

	    // shift elements to the right
	    for (int i = n - 1; i > 0; i--) {
	        array[i] = array[i - 1];
	    }
	    array[0] = temp; // put last element at the first place

	    return array; // return updated array
	}
	public static void ArrayRotateLeftCharacter(char[] chararray1) {
	    char temp = chararray1[0];
	    for (int i = 0; i < chararray1.length - 1; i++) {
	        chararray1[i] = chararray1[i + 1];
	    }
	    chararray1[chararray1.length - 1] = temp;

	    // Print result
	    System.out.println(new String(chararray1));
	}
	public static void ArrayRotateRightCharacter(char[] chararray2) {
		int n=chararray2.length;
	    char temp = chararray2[n-1];
	    for (int i = n-1; i >0; i--) {
	        chararray2[i] = chararray2[i - 1];
	    }
	    chararray2[0] = temp;

	    // Print result
	    System.out.println(new String(chararray2));
	}



}
