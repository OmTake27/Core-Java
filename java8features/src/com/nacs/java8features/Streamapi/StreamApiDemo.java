package com.nacs.java8features.Streamapi;

import java.util.Arrays;

public class StreamApiDemo {
	public static void main(String[] args) {

		System.out.println();
		int[] intArray = { 1, 3, 5, 6, 7, 8, 9, 34, 54, 56, 67, 45, 34, 34 };
		Arrays.stream(intArray).filter(n -> n % 2 == 0).filter(n -> n > 7).forEach(n -> System.out.println(n));
		System.out.println();
		String[] StringArray1 = { "om", "mahesh", "ganesh", "suresh", "rohit", "kajal" };
		Arrays.stream(StringArray1).filter(str -> str.charAt(1) == 'a').filter(str -> str.length() % 2 != 0)
				.forEach(str -> System.out.println(str));
		System.out.println();
		int[] intArray3 = { 67, 70, 80, 65, 77 };
		Arrays.stream(intArray3).filter(no -> no % 2 != 0).mapToDouble(no -> no * 3.14f)
				.forEach(no -> System.out.println(no));
		System.out.println();
		String[] names = { "ABsdgcbdsC", "BBsdgC", "gdsgfBC", "asfae" };
		Arrays.stream(names).map(s -> s.length()).map(number -> number + 1).sorted()
				.forEach(n -> System.out.println(n));
		System.out.println();
		int[] intArray4 = { 67, 70, 70, 77, 80, 65, 77, 3224, 34563, 34563, 235, 34, 5653445, 243, 354, };
		//Arrays.stream(intArray4).distinct().peek(System.out::println)/*.skip(2).limit(6)*/.forEach(System.out::println);
        System.out.println();
        Arrays.stream(intArray4).filter(n->n%2!=0).map(n->n*n).limit(2).forEach(System.out::println);
        System.out.println();
        String[] names1 = {"OM","ganesh","JAY","VIVEK","vaibhav","grish","YASH","abhijeet","MOHAN","mahesh","pranav"};
      //  Arrays.stream(names1).distinct().map(n->n.length()).sorted().limit(5).forEach(System.out::println);
        System.out.println();
        Arrays.stream(names1).distinct().filter(str->str.length()%2==0).map(str->str.toLowerCase()).sorted().forEach(System.out::println);
	}
}
