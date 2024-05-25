package org.example.lab6;

import java.util.Arrays;
import java.util.List;


public class Main {
	public static void main(String[] args) {
		final List<Double> prices = Arrays.asList(10.0, 12.0, 14.0, 22.0);

		System.out.printf("Total price: %.2f\n", TaxCalculator.calculateTotalPrice(prices, true));
		System.out.printf("Total price wit tax: %.2f\n", TaxCalculator.calculateTotalPrice(prices, true, .1));
	}
}
