package com.nacs.oops.inhertance.main;



import java.time.LocalTime;

import com.nacs.oops.inhertance.subtype.Car;
import com.nacs.oops.inhertance.subtype.LocalTrain;
import com.nacs.oops.inhertance.subtype.Train;
import com.nacs.oops.inhertance.supertype.Vehicle;

public class ObjectUpCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle =new Train();
		vehicle.setNoOfTyres(6);
	
		
		
       //upcasting sub->Super
		Car car = new Car();
		//downcasting Super->sub
		vehicle=car;
		Car newCar = (Car)vehicle;	
		Train shatabdi =new Train();
		LocalTrain harbour= new LocalTrain();
		//upcasting
		shatabdi=harbour;
		//downcasting
		shatabdi.setNoOfTyres(100);
		
	LocalTrain western =(LocalTrain) shatabdi;
		
	
		

	}

	

}
