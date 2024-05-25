package org.example.lab9.bank;


import org.example.lab9.account.Account;
import org.example.lab9.customer.Customer;

public class Bank {
	private final Customer customer;

	public Bank(final Customer customer) {
		this.customer = customer;
	}

	public Bank(final double balance) {
		this.customer = new Customer(new Account(balance));
	}

	public Customer getCustomer() {
		return customer;
	}

	public double getCustomerAccountBalance() {
		return customer.getAccount().getBalance();
	}
}
