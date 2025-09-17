package com.nacs.generic.Classes.main;

import com.nacs.generic.Classes.Box;

public class WildCardDemo {

	public static void main(String[] args) {
		Box<? extends Number> objectBox =new Box();
		objectBox.setData(8789);
		printdata(objectBox);
}
	public static <T>void printdata(Box/*<T>*/<? > box) {//void card charater is unbound charater
		System.out.println(box.getData());
	}
	
	//?Super I

}
