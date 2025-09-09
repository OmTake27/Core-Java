package com.nacs.oops.polymorphism;

public class MethodOverridingDemo {
	
    public MethodOverridingDemo() {
		System.out.println("this");
		// TODO Auto-generated constructor stub
	}

	protected SubMethodOverriding printData(String data) {
        System.out.println("Super Class" + data);
		return null;
    }

    // duplicate method example (not valid override, different name due to case-sensitivity)
    // public void PrintData(String data) { }
}
