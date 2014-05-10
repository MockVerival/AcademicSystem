package academicSystem.people;

import java.util.List;

import academicSystem.library.Book;
import academicSystem.library.BookInterface;

public class Student extends Entity implements BookInterface {
	protected int period;
	protected double income;
	protected int maxCredits;
	
	public Student() {

	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
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
