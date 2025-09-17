package com.nacs.generic.Classes;

public class Calculation<T extends Number>{
	public int add(T t1,T t2) {
		return t1.hashCode()+t2.hashCode();
	}
	public double addd(T t1,T t2) {
		return t1.doubleValue()+t2.doubleValue();
	}
	

}
