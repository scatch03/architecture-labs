package org.example.lab8;


public class Main {
	public static void main(String[] args) {
		final Customer customer = new Customer("Nick", "01200, New York, Chelsy st., 6/11");
		final Order order = new Order(customer, "Soap",2);

		order.printOrderDetails();
		System.out.println("============================================================================================");
		System.out.printf("Shipping cost: %.2f\n", customer.calculateShippingCost());
	}
}
