package com.codingdojo.bankaccount;

public class BankAccount {
	String AccountNumber;
	Double CheckingBalance;
	Double SavingBalance;
	private static double Total = 0;
	private static int AccountsCreated = 0;
	
	public BankAccount(String num,double check,double save) {
		this.AccountNumber = num;
		this.CheckingBalance = check;
		this.SavingBalance = save;
		Total += check + save;
		AccountsCreated++;
	}
	
	
	
	
	public static int AccountCount() {
		return AccountsCreated;
	}
	
	public static double Total() {
		return Total;
	}
}
