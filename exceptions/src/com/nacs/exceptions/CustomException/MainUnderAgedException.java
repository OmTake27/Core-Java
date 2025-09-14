package com.nacs.exceptions.CustomException;

public class MainUnderAgedException {
	public static void main(String[] args) {
		int age=17;
		try {
			checkAge(age);
		} catch (UnderAgedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static boolean checkAge(int age) throws UnderAgedException {
		if(age>18) {
			return true;
		}
		else {
			throw new UnderAgedException("Candidate's Age is below 18");
		}
	}

}
