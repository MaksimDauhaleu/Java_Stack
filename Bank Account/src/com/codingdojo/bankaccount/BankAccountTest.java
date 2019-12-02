package com.codingdojo.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount x = new BankAccount("25hl12",25.12,125.65);
		BankAccount y = new BankAccount("25hl12",25.12,125.65);
		BankAccount t = new BankAccount("25hl12",25.12,125.65);
		
		System.out.println(x.AccountCount());
		System.out.println(x.Total());
		System.out.println((25.12 * 3) + (125.65 * 3));
	}
}
