package com.codingdojo.bankaccount;
import java.util.Random;


public class BankAccount {
	String accountNumber = "";
	private static Double CheckingBalance = 0.00;
	private static Double SavingBalance = 0.00;
	private static double Total = 0;
	private static int AccountsCreated = 0;
	
	public BankAccount() {
		newAccountNumber();
		Total += this.getCheckinBalance() + this.getSavingBalance();
		AccountsCreated++;
	}
	
	//Getters
	public static double getCheckinBalance() {
		return CheckingBalance;
	}
	public static double getSavingBalance() {
		return SavingBalance;
	}
	
	
	//Setters
	public void setCheckingBalance(Double amount) {
		this.CheckingBalance = amount;
	}
	
	public void setSavingBalance(Double amount) {
		this.SavingBalance = amount;
	}
	
	
	
	
	public static int AccountCount() {
		return AccountsCreated;
	}
	
	public static double Total() {
		return Total;
	}
	
	private String newAccountNumber() {
		String numberTable = "0123456789";
		String randomNumber = "";
		
		Random rand = new Random();
		
		for(int i = 0; i < 10; i++) {
			char num = numberTable.charAt(rand.nextInt(10));
			randomNumber += num;
		}
		accountNumber = randomNumber;
		return randomNumber;	
	}
	
	public void makeDeposit(String type, Double depositAmount) {
		if(type == "checking" || type == "Checking") {
			setCheckingBalance(getCheckinBalance() + depositAmount);
			Total += depositAmount;
		}
		if(type == "saving" || type == "Saving") {
			setSavingBalance(getSavingBalance() + depositAmount);
			Total += depositAmount;
		}
		else {
			System.out.println("Please choose apporpiate account type.");
		}	
	}
	
	
	public void makeWithdraw(String type,double amount) {
		if(type == "checking" || type == "Checking") {
			if(getCheckinBalance() < amount) {
				System.out.println("Insufficient Funds!");
			}else {
				setCheckingBalance(getCheckinBalance() - amount);
				Total -= amount;
			}
		}
		if(type == "saving" || type == "Saving") {			
			if(getSavingBalance() < amount) {
				System.out.println("Insufficient Funds!");
			}else {
				setSavingBalance(getSavingBalance() - amount);
				Total -= amount;
			}
		}
		else {
			System.out.println("Please choose apporpiate account type.");
		}
	}
	
	public void printAll() {
		System.out.println("Account Number: " + accountNumber +" "+  "Checking Balance: " + CheckingBalance +" "+ "Saving Balance: " + SavingBalance +" "+ "Total: " + Total +" "+ "Accounts Created: " +" "+ AccountsCreated);
	}
}
