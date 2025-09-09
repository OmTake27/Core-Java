package com.nacs.oops.polymorphism;

import java.util.Arrays;

public class MainMethodOverloadingDemo {
	
	
	public static void main(String[] args) {
		
	
	MethodOverLoadingDemo demo = new MethodOverLoadingDemo();
	demo.printdata(10,10F);//F->float
	byte var1=10;
	short var2=1000;
	int var3=100000;
	long var4=1000000L;
	float var5=10.0F;
	double var6=1000D;
	boolean var7=true;//false
	char var8 = 'S';
	String name="om";
int[] array= {166,240,320};
Arrays.sort(array);
System.out.println(array);
}}