package org.example.lab10.library;

/**
 * Library implementation.
 */
public class LibraryBook {
	private final String author;
	private final String title;
	private final int publicationYear;
	private boolean checkedOut;

	public LibraryBook(final String author,
	                   final String title,
	                   final int publicationYear) {
		this.author = author;
		this.title = title;
		this.publicationYear = publicationYear;
	}

	public boolean checkOut() {
		if (!checkedOut) {
			checkedOut = true;
			return true;
		}
		return false;
	}

	public boolean returnBook() {
		if (checkedOut) {
			checkedOut = false;
			return true;
		}
		return false;
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public boolean isCheckedOut() {
		return checkedOut;
	}
}


