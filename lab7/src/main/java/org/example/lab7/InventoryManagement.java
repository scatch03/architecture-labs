package org.example.lab7;

import java.util.List;


public class InventoryManagement {
	private final List<Product> products;

	public InventoryManagement(final List<Product> products) {
		this.products = products;
	}

	public void printProductDetails(final int productId) {
		for (final Product product : products) {
			if (product.getProductId() == productId) {
				product.printProductDetails();
			}
		}
	}
}



