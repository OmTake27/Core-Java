package com.nacs.oops.polymorphism;

public class MethodOverLoadingDemo {

	public void PrintData() {
		System.out.println("Empty parametes list");

	}

	public void PrintData(int data) {
		System.out.println("Int parameter:" + data);

	}

	public void PrintData(String data) {
		System.out.println("String Parameter" + data);

	}
	public void printdata(int data1 ,float data2) {
		
	}
		public void printdata(float data1 ,int data2) {
		
	}

}
