package com.nacs.generic.Classes.main;

import com.nacs.generic.demos.GenericExample;

public class SubTypedIssues {
	public static void main(String[] args) {
		GenericExample<String> stringGenric =new  GenericExample<>();
		GenericExample<Object> ObjectGenric =new  GenericExample<>();
		//both object are of type genericExample not of type stringand Object
		//ObjectGenric =stringGenric;
	}

}
