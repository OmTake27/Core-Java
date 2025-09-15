package com.nacs.java8features.Streamapi;

import java.util.Arrays;

public class StreamApiDemo {
	public static void main(String[] args) {
		
//	
//	int[] intArray= {1,3,5,6,7,8,9,34,54,56,67,45,34,34};
//	Arrays.stream(intArray)
//	.filter(n->n%2==0)
//	.filter(n->n>7)
//	.forEach(n->System.out.println(n));
//	String[] StringArray1= {"om","mahesh","ganesh","suresh","rohit","kajal"};
//	Arrays.stream(StringArray1)
//	.filter(str->str.charAt(1)=='a')
//	.filter(str->str.length()%2!=0)
//
//	.forEach(str->System.out.println(str));
	int [] intArray3 = {67,70,80,65,77};
	Arrays.stream(intArray3)
	.filter(no->no%2!=0)
	.mapToDouble(no->no*3.14f)
	.forEach(no->System.out.println(no));
	String[] names= {"ABC","BBC","CBC"};
	Arrays.stream(names)
	.map(s->s.length())
	.forEach(System.out::println);
	
	}
}
