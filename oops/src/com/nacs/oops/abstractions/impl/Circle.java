package com.nacs.oops.abstractions.impl;

import com.nacs.oops.abstractions.Shape;

public class Circle implements Shape {
	private final float PI;
	private int radius;
	

	public Circle() {
		this.PI = 3.14F;
		// TODO Auto-generated constructor stub
	}

	public Circle(int radius, float pi) {
		super();
		this.radius = radius;
		PI = pi;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public float getPi() {
		return PI;
	}

	@Override
	public float calculateArea() {
		return PI*radius*radius;
	}
	@Override
	public  void printArea() {
		System.out.println("Area of Circle "+calculateArea());
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	

	
	

}
