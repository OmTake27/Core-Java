package com.nacs.datatypes.typecasting.main;

import com.nacs.datatypes.typecasting.TypeCasting;

public class MainTypeCasting {
	public static void main(String[] args) {
		TypeCasting typeCasting = new TypeCasting();
		int number=10;
		char charVariable='A';
		byte byteVariable=65;
		typeCasting.widening(charVariable);
		typeCasting.narrowingToChar((char)byteVariable);
		System.out.println(typeCasting.getNumber());
		System.out.println(typeCasting.getCharVariable());
		
		
	}

}
