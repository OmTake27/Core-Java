package com.nacs.accessmodifiers;

public class PrivateAccessModifiers {
	private int number;

	public PrivateAccessModifiers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PrivateAccessModifiers(int number) {
		super();
		if (isVaild(number))
			this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		if (isVaild(number))
			this.number = number;
	}

	private boolean isVaild(int number) {
		return number >= 18 && number <= 21;
	}
}
