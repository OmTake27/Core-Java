package com.nacs.logicalprograms;

public class Power {
	int base ;
	int exponent;
	public Power() {
		
	}
    public Power(int base,int exponent) {
    	this.base=base;
    	this.exponent=exponent;
    }
    public int getbase() {
    	return base;
    	
    }
    public int getexponent() {
    	return exponent;
    }
    public void setbase(int base) {
       this.base=base;    	
    }
    public void setexponent( int exponent) {
    	this.exponent=exponent;
    }
    public int calculatePower() {
    	int power=1;
    	for(int i=0;i<exponent;i++) {
    	// power=power*base;
    	power*=base;}
    	return power;
    	
    
}}
