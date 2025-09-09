package com.nacs.oops.abstractions;

public interface Shape {
	public abstract float calculateArea();
	public default void printArea() {
		System.out.println("Area "+calculateArea());
	}
	

}
