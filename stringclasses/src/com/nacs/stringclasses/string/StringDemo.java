package com.nacs.stringclasses.string;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class StringDemo {
	public static void main(String[] args) {
		String name = new String("ABC");
		String name1 = "ABC";
		String name2 = "ABC";
		for (int i = 0; i <= 10; i++) {
			name = "ABC" + i;// string is worst for modification it best for storeing the data in heap
		}
		System.out.println(name2 == name1);
		System.out.println(name == name1);
		System.out.println(name);
		System.out.println();
		StringBuilder name4 = new StringBuilder();
		name4.append("Rohit Marked, I am from Lal Taki");
		name4.append(",Ahilyanagar");
		System.out.println(name4.length());
		System.out.println(name4.capacity());
		System.out.println();
		StringBuilder name5 = new StringBuilder("Rohit");
		System.out.println(name5.length());
		System.out.println(name5.capacity());
		System.out.println();

		StringBuilder name6 = new StringBuilder("Rohit");
		name6.ensureCapacity(60);
		System.out.println(name6.length());
		System.out.println(name6.capacity());
		String name7 = "om23Take";
		StringBuilder sB = new StringBuilder();
		// Consumer<Character> appendToString =sB::append;
		BiConsumer<StringBuilder, Character> appendToString = StringBuilder::append;
		int j = 0;
		for (int i = 0; i < name7.length(); i++) {
			if (Character.isAlphabetic(name7.charAt(i))) {
				if (j % 2 == 0) {
					appendToString.accept(sB, Character.toUpperCase(name7.charAt(i)));
				} else {
					appendToString.accept(sB, Character.toLowerCase(name7.charAt(i)));

				}
				j++;
			}
		}
		System.out.println(sB.toString());

		String name8 = new String("ABC");
		System.out.println(name8.intern() == name2);
		String[] names = { "pranali", "sakshi", "om", "Mahesh", "jay", "Ganesh" };
		String name9 = String.join(", ", names);
		System.out.println(name9);
		String name10 = "Ommmmmmmsmmmmmmmmmmm";
		if (name10.matches("[A-Z][a-z]{1,14}")) {
			System.out.println("Valid name");

		} else {
			System.out.println("Invalid Name");
		}
		String name11 = "Kajal";
		char[] nameCharArray = name11.toCharArray();
		System.out.println(nameCharArray);
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("ABC");
		stringBuilder.insert(2, " AAA");
		System.out.println(stringBuilder);
		System.out.println(stringBuilder.charAt(3));
		
		//System.out.println(stringBuilder.delete(2,6));
		System.out.println(stringBuilder.deleteCharAt(6));
		System.out.println(stringBuilder.replace(2,5,"*"));
		
		stringBuilder.setCharAt(3,'@');
		System.out.println(stringBuilder);
		System.out.println(stringBuilder.reverse());
		stringBuilder.setLength(3);
		System.out.println(stringBuilder);
		System.out.println(stringBuilder.length());
		StringBuilder sam =new StringBuilder();
		sam.append("om ,mahesh,ganesh");
		String result=sam.substring(7,11);
		System.out.println(result);
		StringBuilder sa =new StringBuilder();
		sa.append("1234567890");
		System.out.println(sa.length());
		System.out.println(sa.capacity());
		sa.trimToSize();
		System.out.println(sa.length());
		System.out.println(sa.capacity());
	
		

		
		

	}
}
