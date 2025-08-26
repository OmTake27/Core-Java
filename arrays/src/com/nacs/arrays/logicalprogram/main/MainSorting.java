package com.nacs.arrays.logicalprogram.main;

import com.nacs.arrays.logicalprogram.Sorting;

public class MainSorting {
	public static void main(String[] args) {
//        int[] intArray = { 40, 50, 10, 30, 20 };
//
//        System.out.println("Before Sorting:");
//        printArray(intArray);
//        System.out.println();
//
//        // Uncomment one at a time to test
//
//        // Using Bubble Sort
//        // Sorting.bubbleSorth(intArray);
//
//        // Using Selection Sort
//       // Sorting.selectionSort(intArray);
//        Sorting.insertionSort(intArray);
//        System.out.println("After Sorting:");
//        printArray(intArray);
//        Sorting.insertionSort(intArray);
//    }
//
//    public static void printArray(int... array) {
//        for (int no : array) {
//            System.out.print(no + " ");
//        }
//        System.out.println(); // newline after printing
//    }
		// Main Method

		int[] array= {90, 20, 40, 10, 80};
				System.out.print("Before Sorting: ");
				for(int ele:array)
					System.out.print(ele + " ");
				Sorting.divide(0, array.length-1, array);
				System.out.println();
				System.out.print("After Sorting: ");
				for(int ele:array)
					System.out.print(ele + " ");

	}

//	public static void printArray(int... array) {
//		for (int no : array) {
//			System.out.println(no + " ");
//		}
//	}
}
