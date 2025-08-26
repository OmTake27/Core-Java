package com.nacs.arrays.logicalprogram.main;

import com.nacs.arrays.logicalprogram.StringSorting;

public class MainStringSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nameArray = { "Rohit", "tejas", "Pratik", "Yash", "om", "maheah" };
//		StringSorting.insertionSort(nameArray);
		//StringSorting.bubbleSort(nameArray);
		StringSorting.selectionSort(nameArray);
		for (int i = 0; i < nameArray.length; i++) {
			System.out.println(nameArray[i] + "  ");
		}

	}

}
