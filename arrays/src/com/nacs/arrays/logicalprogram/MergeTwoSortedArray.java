package com.nacs.arrays.logicalprogram;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = { 40, 50, 80 };
		int[] array2 = { 10, 20, 90 };

		mergeArrays(array1, array2);

	}

	public static void mergeArrays(int[] array1, int[] array2) {
		int firstArrayLength = array1.length;
		int SecondArrayLength = array2.length;
		int[] result = new int[firstArrayLength + SecondArrayLength];
		int f = 0;
		int s = 0;
		int r = 0;
		while (f < firstArrayLength && s < SecondArrayLength) {
			if (array1[f] < array2[s]) {
				result[r++] = array1[f++];
			} else {
				result[r++] = array2[s++];
			}
		}
			while (f < firstArrayLength) {
				result[r++] = array1[f++];

			}
			while (s < SecondArrayLength) {
				result[r++] = array2[s++];
			}

		
		for (int ele : result) {
			System.out.println(ele + " ");
		}

	}

}
