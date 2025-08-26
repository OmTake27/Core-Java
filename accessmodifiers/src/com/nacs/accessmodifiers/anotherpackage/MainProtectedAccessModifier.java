package com.nacs.accessmodifiers.anotherpackage;

import com.nacs.accessmodifiers.ProtectedAccessModifier;

public class MainProtectedAccessModifier extends ProtectedAccessModifier {
	public static void main(String[] args) {
		MainProtectedAccessModifier obj = new MainProtectedAccessModifier();
		obj.setNumber(10);
		System.out.println(obj.getNumber());
	}
}
