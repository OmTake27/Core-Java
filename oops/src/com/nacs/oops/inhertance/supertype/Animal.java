package com.nacs.oops.inhertance.supertype;

public class Animal {
	private int age;
	private String sound;
	private char gender;

	public Animal() {
		System.out.println("This is a Animal constructor");
	}

	public Animal(int age, String sound, char gender) {
		super();
		this.age = age;
		this.sound = sound;
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String toString() {
		return "Sound : " + sound + ", age : " + age + ", gender : " + gender;

		
	}

//	@Override
//	public String toString() {
//		return "Animal [age=" + age + ", sound=" + sound + ", gender=" + gender + "]";
//	}

}