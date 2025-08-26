package com.nacs.logicalprograms.main;

import com.nacs.logicalprograms.Power;

public class MainPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Power power = new Power();
		power.setbase(10);
		power.setexponent(2);
		power.calculatePower();
		int tempPower = power.calculatePower();
		System.out.println(power.getbase() + "  ^  " + power.getexponent() + " = " + tempPower);

	}

}
