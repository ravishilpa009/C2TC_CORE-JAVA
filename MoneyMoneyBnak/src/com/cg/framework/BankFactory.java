package com.cg.framework;

public  abstract class BankFactory {
	public abstract SavingsAccount getNewSavingAccount(AccNo, AccNm, AccBal, isSalary);
	public abstract CurrentAccount getNewCurrentAccount(AccNo,accNm,accBal,creditLimit);

}
