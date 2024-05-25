package org.example.lab8;


public class Customer {
	private final String name;
	private final String address;

	public Customer(final String name, final String address) {
		this.name = name;
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public String getName() {
		return name;
	}

	public void printShippingAddress(){
		System.out.printf("Shipping to %s\n", address);
	}

	public double calculateShippingCost() {
		if (address.contains("New York")) {
			return 5.00;
		} else if (address.contains("California")) {
			return 10.00;
		} else {
			return 15.00;
		}
	}
}

