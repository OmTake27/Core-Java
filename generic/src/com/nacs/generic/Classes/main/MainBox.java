package com.nacs.generic.Classes.main;

import com.nacs.generic.Classes.Box;
import com.nacs.generic.demos.Student;

public class MainBox {
	public static void main(String[] args) {
		
	
	Box<String> box = new Box<>();
	box.setData("ABC");
	System.out.println(box.getData());
	Box<Integer> box1 = new Box<>();
	box1.setData(2321432);
	System.out.println(box1.getData());
	add(10,20);
	add(30,20);
	//can not deploy ARray
	//Box1<Integer>[] boxArray = new Box<>[];
	Box<Student> box2 = new Box<>();
	}
	public static void add(int number1,int number2) {
		System.out.println(number1+number2);
	}
	
}
