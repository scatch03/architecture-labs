package org.example.lab10;


import org.example.lab10.my.LibraryBook;
import org.example.lab10.my.BasicCalculator;

public class Main {
	public static void main(final String[] args) {
		testMyExtendedCalculator();

		System.out.println("============================================================================================");

		testMyExtendedLibraryBook();
	}

	private static void testMyExtendedCalculator() {
		final BasicCalculator calculator = new BasicCalculator();

		System.out.println("Addition: 5+3=" + calculator.add(5,3));
		System.out.println("Subtraction: 5-3=" + calculator.subtract(5,3));
		System.out.println("Multiplication: 5*3=" + calculator.multiply(5, 3));
		System.out.println("Division: 5/3=" + calculator.divide(5, 3));
	}

	private static void testMyExtendedLibraryBook() {
		final LibraryBook libraryBook = new LibraryBook("The Great Gatsby", "F. Scott Fitzgerald",1925);

		System.out.println("Checking out: " + libraryBook.checkOut());
		System.out.println("Checking out: " + libraryBook.checkOut());
		System.out.println("Checked out: " + libraryBook.isCheckedOut());
		System.out.println("Book info: " + libraryBook.getBookInfo());
	}
}
