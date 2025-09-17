package com.nacs.generic.Classes.main;

import com.nacs.generic.Classes.genericArray;

public class MainGenericArray {
	public static void main(String[] args) {
		genericArray<Integer> intArray =new genericArray<>();
		intArray.setTArray(new Integer[] {1,2,3,4,5,6,7});
		intArray.printTArray();
		genericArray<String> StringArray =new genericArray<>();
		StringArray.setTArray(new String[] {"om","mahesh","akash","neha","asha","tom"});
		StringArray.printTArray();
		
	}

}
