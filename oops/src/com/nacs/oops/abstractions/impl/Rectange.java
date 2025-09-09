package com.nacs.oops.abstractions.impl;

import com.nacs.oops.abstractions.Shape;

public class Rectange implements Shape{
	private int height;
	private int width;
	public Rectange() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rectange(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public float calculateArea() {
		return height*width;
		
		
	}
	@Override
	public void printArea() {
		System.out.println("Area of Rectangle "+calculateArea());
	}
	@Override
	public String toString() {
		return "Rectange [height=" + height + ", width=" + width + "]";
	}
	
	

}
