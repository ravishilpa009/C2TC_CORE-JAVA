package com.cg.bankapplication;

import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAccount;
import com.cg.framework.SavingsAccount;

public class MMBankFactory extends BankFactory{

	@Override
	public SavingsAccount getNewSavingAccount(int AccNo, String accNm, float accBal, float isSalaried) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CurrentAccount getNewCurrentAccount(int AccNo, String accNm, float accBal, float creditLimit) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}