package academicSystem.people;

import java.util.List;

import academicSystem.course.Course;
import academicSystem.course.Discipline;
import academicSystem.course.DisciplineInterface;
import academicSystem.library.Book;
import academicSystem.library.BookInterface;

public class Student extends Entity implements BookInterface, DisciplineInterface {
	protected int period;
	protected double income;
	protected Course course;
	protected List<Discipline> disciplines;
	
	public Student(Course course) {
		this.course = course;
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

	public Course getCourse() {
		return course;
	}
	
	@Override
	public void getBooks(List<Book> books) {
		
	}

	@Override
	public void returnBooks(List<Book> books) {
		
	}

	@Override
	public void addDiscipline(Discipline discipline) {
		this.disciplines.add(discipline);
	}

	@Override
	public List<Discipline> getDisciplines() {
		return this.disciplines;
	}
}