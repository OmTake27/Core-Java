package com.nacs.logicalprograms;

public class CheckNumbers {
	int number;

	public CheckNumbers() {
	}

	public CheckNumbers(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean isPerfect() {
		int sum = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		return (sum == number);
	}

	public int getReverseNumber() {
		int reverseNumber = 0;
		int temp = number;
		while (temp != 0) {
			reverseNumber = reverseNumber * 10 + temp % 10;
			temp /= 10;
		}

//        do {
//            reverseNumber = reverseNumber * 10 + temp % 10;
//        } while ((temp /= 10) != 0);

		return reverseNumber;
	}

	public boolean isPalindrome() {
		return number == getReverseNumber();
	}

	public boolean isPrime() {
		// boolean flag=true;
		for (int i = 2; i * i <= number; i++) {
			if (number % i == 0) {
				return false;

			}

		}
		return true;
	}

	private int calculatePower(int base, int exponent) {
		int power = 1;
		for (int i = 1; i <= exponent; i++) {
			power *= base;
		}
		return power;
	}

	private int getNoOfDigits(int number) {
		int digits = 0;
//	String digits=number+"";
//	return digits.length();
//		do {
//			digits++;
//		}while((number/=10)!=0);
		while (number != 0) {
			digits++;
			number /= 10;
		}
		return digits;

		// return number+"".length();
	}

	public boolean isArmstrong() {
		int temp = number;
		int armstrongNumber = 0;
		int digits = getNoOfDigits(temp);
		while (temp != 0) {
			armstrongNumber = armstrongNumber + calculatePower(temp % 10, digits);
			temp /= 10;
		}
		// int temp=number;
//		int armstrongNumber=0;
//		int digits=number+"".length();
//		while(temp!=0) {
////			armstrongNumber = armstrongNumber+(int)Math.pow(temp%10,digits);
//			armstrongNumber +=Math.pow(temp%10,digits);
//			number/=10;
//		}
		return number == armstrongNumber;
		
	}
	 
}
