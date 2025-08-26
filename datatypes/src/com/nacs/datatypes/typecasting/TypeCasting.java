package com.nacs.datatypes.typecasting;

public class TypeCasting {
		float number;
		char charVariable;
		
		public void widening(float number) {
			this.number=number;
			
		}
		public void narrowingToChar(char charVariable) {
			this.charVariable=charVariable;
		}
		
		public float getNumber() {
			return number;
		}
		public char getCharVariable() {
			return charVariable;
		}
		
		
}


