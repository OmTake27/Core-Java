package com.nacs.operators;

public class BinaryOperation {

	// TODO Auto-generated method stub
	int operand1;
	int operand2;

	public BinaryOperation() {

	}

	public BinaryOperation(int operand1, int operand2) {
		this.operand1 = operand1;
		this.operand2 = operand2;

	}

	public int getOperand1() {
		return this.operand1;
	}

	public int getOperand2() {
		return this.operand2;
	}

	public void setOperand1(int operand1) {
		this.operand1 = operand1;
	}

	public void setOperand2(int operand2) {
		this.operand2 = operand2;
	}

	public int addTwoNumber() {
//	 int result = operand1+operand2;
//	 return result;

		return operand1 + operand2;
	}

	public int subtractOperand1FormOperand2() {
		return operand2 - operand1;
	}

	public int multiplyTwoOperands() {
		return operand1 * operand2;

	}

	public int divideOperand1ToOperand2() {
		return operand2 / operand1;
	}

	public int modulesOfOperand2ToOperand1() {
		return operand2 % operand1;
	}

	public int bitwiseAndOnTwoOperands() {
		return operand1 & operand2;
	}

	public int bitwiseOrOnTwoOperands() {
		return operand1 | operand2;
	}

	public int bitwiseXorOnTwoOperands() {
		return operand1 ^ operand2;
	}

}
