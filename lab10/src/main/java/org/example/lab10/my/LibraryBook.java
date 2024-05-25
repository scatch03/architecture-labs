package org.example.lab10.my;

/**
 * My extended implementation.
 */
public class LibraryBook {
	private final org.example.lab10.library.LibraryBook book;

	public LibraryBook(final String author,
	                   final String title,
	                   final int publicationYear) {
		this.book = new org.example.lab10.library.LibraryBook(author, title, publicationYear);
	}

	public boolean checkOut() {
		return book.checkOut();
	}

	public boolean returnBook() {
		return book.returnBook();
	}

	public boolean isCheckedOut() {
		return book.isCheckedOut();
	}

	public String getBookInfo() {
		return String.format("[title=\"%s\", author=\"%s\", published=%d, checkedOut=%s]",
				book.getTitle(), book.getAuthor(), book.getPublicationYear(), book.isCheckedOut());
	}
}


