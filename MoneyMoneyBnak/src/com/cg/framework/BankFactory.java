package com.cg.framework;

public abstract class BankFactory {
		
		public abstract SavingsAccount getNewSavingAccount(int AccNo, String accNm, float accBal, float isSalaried);
		public abstract CurrentAccount getNewCurrentAccount(int AccNo, String accNm, float accBal, float creditLimit);


}
