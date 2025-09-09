package com.nacs.oops.inhertance.subtype;

public class Cat extends com.nacs.oops.inhertance.supertype.Animal {
	private String nightVision;

	public Cat() {
	}

	public Cat(String nightVision, int age, String sound, char gender) {
		super(age, sound, gender);
		this.nightVision = nightVision;
	}

	public Cat(String sound, char gender) {
		super(0, sound, gender);
		nightVision = "NA";
	}

	public String getNightVision() {
		return nightVision;
	}

	public void setNightVision(String nightVision) {
		this.nightVision = nightVision;
	}
public void setAge(int age) {
	if(age>0&& age<=12) {
		super.setAge(age);
	}
}
//	@Override
	@Override
	public String toString() {
		return "nightVision : " + nightVision + "," + super.toString();
//				+", Sound= " + getSound() 
//				+ ", age= " + getAge() 
//				+ ", gender= " + getGender();
	}

}