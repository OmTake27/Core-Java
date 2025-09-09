package com.nacs.oops.abstractions.main;

import com.nacs.oops.abstractions.AbstractDemo;
import com.nacs.oops.abstractions.impl.SubAbstractDemo;

public class MainSubAbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractDemo demo = new SubAbstractDemo();
		demo.showMessage();

	}

}
