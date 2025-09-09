package com.nacs.oops.inhertance.main;

import com.nacs.oops.inhertance.subtype.Cat;

public class MainAnimalpets {
	public static void main(String[] args) {
		
		Cat cat=new Cat("Very Good!..",3,"Meow Meow..",'M');
		
		System.out.println(cat.getNightVision());
		System.out.println(cat.getAge());
		System.out.println(cat.getGender());
		System.out.println(cat.getSound());
		
		Cat hostelCat=new Cat("Hisssss..",'F');
		hostelCat.setAge(6);
		System.out.println(hostelCat.toString());
		
	}
}