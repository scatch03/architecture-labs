package org.example.lab10.my;

/**
 * My extended version, based on library instance.
 */
public class BasicCalculator extends org.example.lab10.library.BasicCalculator {

	public double multiply(final double a, final double b) {
		return a * b;
	}

	public double divide(final double a, final double b) {
		return a / b;
	}
}
