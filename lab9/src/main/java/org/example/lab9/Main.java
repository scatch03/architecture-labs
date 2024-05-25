package org.example.lab9;

import org.example.lab9.bank.Bank;

public class Main {
	public static void main(final String[] args) {
		final Bank bank = new Bank(1000);
		final double balance = bank.getCustomerAccountBalance();
		System.out.printf("The balance is: %.3f\n", balance);
	}
}
