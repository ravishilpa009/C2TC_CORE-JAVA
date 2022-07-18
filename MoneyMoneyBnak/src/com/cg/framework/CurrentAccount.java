package com.cg.framework;

public abstract class CurrentAccount extends BankAccount {
	float creditLimit;
	void withdraw(float creditLimit)
	{
		
	}
	public String toString() {
		return "CurrentAccount [creditLimit=" + creditLimit + ", accNo="+ accNO +", accNm=" + accNm +",
				+", toString()=" + super.toString() +", getClass()=" + getClass() +",hashCode()="+ "]";
	}
