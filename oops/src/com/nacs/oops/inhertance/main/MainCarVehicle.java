package com.nacs.oops.inhertance.main;

import com.nacs.oops.inhertance.subtype.Car;

public class MainCarVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		car1.setAutomatic(false);
		car1.setNoOfAirBags(2);
		car1.setEngine("1.2 L");
		car1.setNoOfTyres(10);
		System.out.println(car1);
		Car car2 = new Car();
		car2.setAutomatic(true);
		car2.setNoOfAirBags(4);
		car2.setNoOfAirBags(2);
		car2.setEngine("1.5 L");
		car2.setNoOfTyres(-2);
		System.out.println(car2);

	}

}
