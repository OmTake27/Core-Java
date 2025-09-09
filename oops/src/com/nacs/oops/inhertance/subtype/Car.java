package com.nacs.oops.inhertance.subtype;

import com.nacs.oops.inhertance.supertype.Vehicle;

public class Car extends Vehicle {
	private boolean automatic;
	private int noOfAirBags;
	public Car() {
		
		// TODO Auto-generated constructor stub
	}
	public Car(int noOfTyres, String engine) {
		super(noOfTyres, engine);
		// TODO Auto-generated constructor stub
	}
	public Car(boolean automatic, int noOfAirBags) {
		super();
		this.automatic = automatic;
		this.noOfAirBags = noOfAirBags;
	}
	public boolean isAutomatic() {
		return automatic;
	}
	public void setAutomatic(boolean automatic) {
		this.automatic = automatic;
	}
	public int getNoOfAirBags() {
		return noOfAirBags;
	}
	public void setNoOfAirBags(int noOfAirBags) {
		this.noOfAirBags = noOfAirBags;
	}
	public void  setnoTyres(int noOfTyres  ) {
		System.out.println("this is Sub");
	}
	@Override
	public String toString() {
		return "Car [automatic=" + automatic + ", noOfAirBags=" + noOfAirBags + "]"+super.toString();
	}
	
	

}
