package org.example.lab8;


public class Order {
	private final Customer customer;
	private final String product;
	private final int quantity;

	public Order(final Customer customer, final String product, final int quantity) {
		this.customer = customer;
		this.product = product;
		this.quantity = quantity;
	}

	public void printOrderDetails() {
		System.out.printf("Order for %s x %d\n", product, quantity);
		customer.printShippingAddress();
	}
}
