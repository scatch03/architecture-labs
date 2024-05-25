package org.example.lab6;

import java.util.List;


public class TaxCalculator {

	public static double calculateTotalPrice(final List<Double> prices, final boolean discount) {
		double totalPrice = 0;
		for (final double price : prices) {
			if (discount) {
				totalPrice += price * .9;
			} else {
				totalPrice += price;
			}
		}
		return totalPrice;
	}

	public static double calculateTotalPrice(final List<Double> prices, final boolean discount, final double tax) {
		return calculateTotalPrice(prices, discount) * (1 + tax);
	}
}
