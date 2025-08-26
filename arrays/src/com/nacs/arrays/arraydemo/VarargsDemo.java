package com.nacs.arrays.arraydemo;

public class VarargsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] array= {1,2,3,4,5};
		//printArray(array);
		printArray(1,2,3,4,5);

	}
	public static void printArray(int length,int... array) { //[] => ... we enter sequence of element of array and also array
		for(int i=0;i<array.length;i++) {                    // variable argement all way be last parameter
			System.out.print(array[i]+ " ");                 //frist value is store in length not in array.
			
		}
	}

}
