package org.example.lab9.customer;


import org.example.lab9.account.Account;

public class Customer {

	private final Account account;

	public Customer(final Account account) {
		this.account = account;
	}

	public Account getAccount() {
		return account;
	}
}



