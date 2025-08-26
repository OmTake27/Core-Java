package com.nacs.arrays.logicalprogram;

import java.util.Arrays;

public class Sorting {

	private Sorting() {

		// TODO Auto-generated constructor stub
	}

	// Bubble Sort
	public static void bubbleSorth(int... array) {
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	// Selection Sort
	public static void selectionSort(int... array) {
		for (int i = 0; i < array.length - 1; i++) {
			int minIndex = i;

			// Find index of smallest element in unsorted part
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}

			// Swap smallest with current element
			int temp = array[minIndex];
			array[minIndex] = array[i];
			array[i] = temp;
		}
	}

	public static void insertionSort(int... array) {
		int key;
		for (int i = 1; i < array.length; i++) {
			key = array[i];
			int j = i - 1;
			while (j >= 0 && key < array[j]) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;

		}
	}


	public static void divide(int left, int right, int... array) {
		if (left < right) {
			int mid = (left + right) / 2;
			divide(left, mid, array);
			divide(mid + 1, right, array);
			//conqure(left, mid, right, array);
			conquer1(left, mid, right, array);
		}

	}

	public static void conquer1(int left, int mid, int right, int... array) {
	    int fArraySize = mid - left + 1;
	    int sArraySize = right - mid;

    int[] firstArray = new int[fArraySize];
	    int[] secondArray = new int[sArraySize];

	   
	    for (int i = 0; i < fArraySize; i++) {
	        firstArray[i] = array[left + i];
	    }

	
	    for (int j = 0; j < sArraySize; j++) {
	        secondArray[j] = array[mid + 1 + j];
	    }
	

	    int f = 0;  
	    int s = 0; 
	    int r = left; 

	    
	    while (f < fArraySize && s < sArraySize) {
//	        if (firstArray[f] <= secondArray[s]) {
//	            array[r++] = firstArray[f++];
//	        } else {
//	            array[r++] = secondArray[s++];
//	        }
	    	array[r++]=(firstArray[f] <= secondArray[s])?firstArray[f++]:secondArray[s++];
	    }

	   
	    while (f < fArraySize) {
	        array[r++] = firstArray[f++];
	    }
	    while (s < sArraySize) {
	        array[r++] = secondArray[s++];
	    }
	}
	


	private static void conqure(int left, int mid, int right, int... array) {
		int[] temp = new int[right + 1];

		for (int i = 0; i < temp.length; i++)
			temp[i] = array[i];

		int f = left;
		int s = mid + 1;
		int r = left;

		while (f <= mid && s <= right)
			if (temp[f] < temp[s])
				array[r++] = temp[f++];
			else
				array[r++] = temp[s++];

		while (f <= mid)
			array[r++] = temp[f++];
		while (s <= right)
			array[r++] = temp[s++];
	}

}
