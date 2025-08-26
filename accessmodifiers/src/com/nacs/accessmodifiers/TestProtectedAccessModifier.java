package com.nacs.accessmodifiers;

public class TestProtectedAccessModifier {
	public static void main(String[] args) {
		ProtectedAccessModifier testProtected = new ProtectedAccessModifier();
		testProtected.setNumber(10); // Works fine (same package)
		System.out.println(testProtected.getNumber());
	}
}