package academicSystem.people;

import java.util.List;

import academicSystem.library.Book;
import academicSystem.library.BookInterface;

public class Teacher extends Employee implements BookInterface {
	protected int maxCredits;
	
	public Teacher() {

	}

	public int getMaxCredits() {
		return maxCredits;
	}

	public void setMaxCredits(int maxCredits) {
		this.maxCredits = maxCredits;
	}

	@Override
	public void getBooks(List<Book> books) {
		
	}

	@Override
	public void returnBooks(List<Book> books) {
		
	}
}
