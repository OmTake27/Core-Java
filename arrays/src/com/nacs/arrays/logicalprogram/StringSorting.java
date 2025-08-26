package com.nacs.arrays.logicalprogram;

public class StringSorting {
	public static void insertionSort(String... nameArray) {
		String key;
		int j;
		for (int i = 1; i < nameArray.length; i++) {
			key = nameArray[i];
			j = i - 1;
			while (j >= 0 && key.compareTo(nameArray[j]) < 0) {
				nameArray[j + 1] = nameArray[j];
				j--;

			}
			nameArray[j + 1] = key;
		}
	}

	public static void bubbleSort(String... nameArray) {
		String t;
		for (int i = 0; i < nameArray.length; i++) {
			for (int j = 0; j < nameArray.length - 1 - i; j++) {
				if (nameArray[j].compareTo(nameArray[j + 1]) > 0) {

					t = nameArray[j];
					nameArray[j] = nameArray[j + 1];
					nameArray[j + 1] = t;
				}
			}
		}
	}

	public static void selectionSort(String... namearray) {

		for (int i = 0; i < namearray.length; i++) {
			int minIndex = i;

			for (int j = i + 1; j < namearray.length; j++) {
				if (namearray[minIndex].compareToIgnoreCase(namearray[j]) > 0) {
					minIndex = j;
				}
			}

			String temp = namearray[minIndex];
			namearray[minIndex] = namearray[i];
			namearray[i] = temp;
		}
	}
	
}
