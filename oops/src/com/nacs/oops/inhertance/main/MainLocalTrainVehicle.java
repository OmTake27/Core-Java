package com.nacs.oops.inhertance.main;

import com.nacs.oops.inhertance.subtype.LocalTrain;

public class MainLocalTrainVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] stops= {":::CSMT:::\n","DADAR:::\n",":::THANE:::\n",":::KALYAN:::\n",":::KARJAT:::\n",":::LONAWALA:::\n"};
		LocalTrain  central = new LocalTrain();
		central.setNoOfBoggies(12);
		central.setEngine("3000hp");
		central.setNoOfTyres(50);
		central.setStops(stops);
		System.out.println(central.toString());
		

	}

}
