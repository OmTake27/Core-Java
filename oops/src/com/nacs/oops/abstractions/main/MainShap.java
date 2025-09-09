package com.nacs.oops.abstractions.main;

import com.nacs.oops.abstractions.impl.Circle;
import com.nacs.oops.abstractions.impl.Rectange;

public class MainShap {
	public static void main(String[] args) {
		Rectange rectangle = new Rectange();
		rectangle.setHeight(10);
		rectangle.setWidth(10);
		System.out.println(rectangle.calculateArea());
		rectangle.printArea();
		Circle circle = new Circle(10, 3.14F);
		System.out.println(circle.calculateArea());

		circle.printArea();
	}
}
