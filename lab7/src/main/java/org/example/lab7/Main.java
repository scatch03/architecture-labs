package org.example.lab7;

import java.util.Arrays;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		final List<Product> productList = Arrays.asList(
				new Product(1, "Soap", "Perfumery", 8.99),
				new Product(2, "Deodorant", "Perfumery", 12.99),
				new Product(3, "Shampoo", "Perfumery", 14.99)
		);

		final InventoryManagement inventoryManagement = new InventoryManagement(productList);

		inventoryManagement.printProductDetails(2);
	}
}
