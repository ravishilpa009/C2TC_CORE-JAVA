package com.cg.framework;

public abstract class CurrentAccount extends BankAccount {
	private final float creditLimit;
	
	public CurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}
	public void withdraw(float creditLimit)
	{
		
	}
	@Override
	public String toString() {
		return "CurrentAccount [creditLimit=" + creditLimit + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}
