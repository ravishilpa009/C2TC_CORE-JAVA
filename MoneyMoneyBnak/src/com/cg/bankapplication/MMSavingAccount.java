package com.cg.framework;

public abstract class SavingsAccount extends BankAccount  {
	private boolean isSalary;
	private static final float MINBAL =1;
	public SavingsAccount(int accNo, String accNm, float accBal, boolean isSalary) {
		super (accNo, accNm, accBal);
	}
	public void withdraw(float accBal)
	{
		
	}
	@Override
	public String toString() {
		return "SavingsAccount [isSalary=" + isSalary + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
	


