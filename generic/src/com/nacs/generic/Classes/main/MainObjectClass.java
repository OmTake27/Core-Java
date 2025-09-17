package com.nacs.generic.Classes.main;

import com.nacs.generic.Classes.ObjectClass;

public class MainObjectClass {
	public static void main(String[] args) {
		ObjectClass objDemo = new ObjectClass();
		objDemo.setObject(10);
		System.out.println(objDemo.getObject());
		Integer no=(Integer)objDemo.getObject();
		
		String data =(String)objDemo.getObject();
		}

}
