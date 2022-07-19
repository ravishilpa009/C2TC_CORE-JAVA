package com.cg.framework;

public abstract class CurrentAccount extends BankAccount{




	private final float creditLimit=100;
	

	public CurrentAccount(int accNo, String accNm, float accBal, float creditLimit2) {
		super(accNo, accNm, accBal);
		
	}


	
 public float getCreditLimit() {
		return creditLimit;
	}


 public void withdraw(float creditLimit) {
	 
 }


@Override
public String toString() {
	return "CurrentAcc [creditLimit=" + creditLimit + ", getCreditLimit()=" + getCreditLimit() + ", getAccNo()="
			+ getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", toString()="
			+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}



}
