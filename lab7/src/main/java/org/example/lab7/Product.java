package org.example.lab7;


public class Product {
	private final int productId;
	private final String name;
	private final String category;
	private final double price;

	public Product(final int productId,
	               final String name,
	               final String category,
	               final double price) {
		this.productId = productId;
		this.name = name;
		this.category = category;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

	public double getPrice() {
		return price;
	}

	public void printProductDetails() {
		System.out.printf("Product ID: %d, Name: %s, Category: %s, Price: %.2f\n", productId, name, category, price);
	}
}


