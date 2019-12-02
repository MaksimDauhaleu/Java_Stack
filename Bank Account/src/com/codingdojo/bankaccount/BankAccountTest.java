package com.codingdojo.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount user1 = new BankAccount();
		BankAccount user2 = new BankAccount();
		BankAccount user3 = new BankAccount();
		
		user1.makeDeposit("saving",25.00);
		user1.makeDeposit("saving",25.00);
		user1.makeWithdraw("saving", 10);
		user1.printAll();
	}
}
