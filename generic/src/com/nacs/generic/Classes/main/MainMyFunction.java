package com.nacs.generic.Classes.main;

import com.nacs.generic.Classes.MyFunction;

public class MainMyFunction {
	public static void main(String[] args) {

		MyFunction<String, Integer> strLength = String::length;
		System.out.println(strLength.myApply("ABC"));
	}

}
