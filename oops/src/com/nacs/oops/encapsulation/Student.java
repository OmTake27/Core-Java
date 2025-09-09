package com.nacs.oops.encapsulation;

public class Student {
	public int rollNo;
	public String name;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRollNo() {
		if (rollNo > 0) {
			return rollNo;
		} else {
			return 0;
		}
	}

	public void setRollNo(int rollNo) {

		this.rollNo = rollNo;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
