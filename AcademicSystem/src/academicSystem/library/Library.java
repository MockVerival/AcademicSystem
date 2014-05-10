package academicSystem.library;

import java.util.List;

public class Library {
	private List<Book> borrowedBooks;
	private List<Book> availableBooks;

	public Library() {

	}

	public List<Book> getBorrowedBooks() {
		return borrowedBooks;
	}

	public void setBorrowedBooks(List<Book> borrowedBooks) {
		this.borrowedBooks = borrowedBooks;
	}

	public List<Book> getAvailableBooks() {
		return availableBooks;
	}

	public void setAvailableBooks(List<Book> availableBooks) {
		this.availableBooks = availableBooks;
	}
}