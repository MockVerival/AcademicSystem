package academicSystem.people;

import java.util.List;

import academicSystem.course.Discipline;
import academicSystem.course.DisciplineInterface;
import academicSystem.library.Book;
import academicSystem.library.BookInterface;

public class Teacher extends Employee implements BookInterface, DisciplineInterface {
	protected int maxCredits;
	protected List<Discipline> disciplines;
	
	public Teacher() {

	}

	public int getMaxCredits() {
		return maxCredits;
	}

	public void setMaxCredits(int maxCredits) {
		this.maxCredits = maxCredits;
	}
	
	@Override
	public List<Discipline> getDisciplines() {
		return this.disciplines;
	}

	@Override
	public void addDiscipline(Discipline discipline) {
		this.disciplines.add(discipline);
	}

	@Override
	public void getBooks(List<Book> books) {
		
	}

	@Override
	public void returnBooks(List<Book> books) {
		
	}
}
