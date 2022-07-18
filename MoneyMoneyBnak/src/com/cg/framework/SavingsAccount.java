package com.cg.framework;

public  abstract class SavingsAccount extends BankAccount  {
	private boolean isSalary;
	private static final float MINBAL=1;
	public SavingsAccount(int accNO,String accNm,float accBal) {
		super(accNo,accNm,accBal);
	}
	public void withdraw(float accBal)
	{
		
	}
	public String toSring{} {
		return "SavingAcc [isSalary=" + isSalary +", accNO= +",accNm=" +accNm +", accBal="+accBal"
				+ ", toString()=" + super.toString() +",getClass()="+geClass()+",hashCode()=" +hashCode()
				+"]";
		

}
