package com.nacs.oops.inhertance.subtype;

import java.util.Arrays;

public class LocalTrain extends Train {
	private String[] stops;

	public LocalTrain() {
		
		// TODO Auto-generated constructor stub
	}

	public LocalTrain(int noOfTyres, String engine, int noOfBoggies) {
		super(noOfTyres, engine, noOfBoggies);
		// TODO Auto-generated constructor stub
	}

	public LocalTrain(String[] stops) {
		super();
		this.stops = stops;
	}

	public String[] getStops() {
		return stops;
	}

	public void setStops(String[] stops) {
		this.stops = stops;
	}
	

	@Override
	public String toString() {
		return "LocalTrain\n stops:\n" + Arrays.toString(stops) + " \n"+super.toString();
	}
	

}
