package com.nacs.arrays.student;

public class Student {
	private int rollNo;
	private String name;
	private float fees;
	private String area;
	public Student() {
	}
	public Student(int rollNo, String name, float fees, String area) {
		this.rollNo = rollNo;
		this.name = name;
		this.fees = fees;
		this.area = area;
	}
	public int getRollNo() {
		return rollNo;
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
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "Student rollNo=" + rollNo + ", name=" + name + ", fees=" + fees + ", area=" + area + " ";
	}
	
	

}
