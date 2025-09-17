package com.nacs.java8features.Streamapi;

import java.util.Comparator;
import java.util.stream.Stream;

import com.nacs.java8features.Streamapi.entities.Student;


public class MainStudent {
	public static void main(String[] args) {
		Student[] studentArray = {
			new Student(3,"Abc"),	
			new Student(2,"Bbc")	,
			new Student(1,"Cbc")	
		};
	
	//studentStream.close; 
//	Comparator<Student> sortByName1=(s1,s2)->s1.getRollNo()-s2.getRollNo();
//	Comparator<Student> sortByName2=(s1,s2)->s2.getRollNo()-s1.getRollNo();
//	Comparator<Student> sortByName3=(s1,s2)->s1.getName().compareTo(s2.getName());
//	Comparator<Student> sortByName4=(s1,s2)->s2.getName().compareTo(s1.getName());
	try(Stream<Student> studentStream= 	Stream.of(studentArray);)
	{
		studentStream.sorted((o1,o2)->o1.getName().compareTo(o2.getName())).forEach(System.out::println);
	}
	}

}
