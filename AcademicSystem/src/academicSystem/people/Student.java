package academicSystem.people;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import academicSystem.course.Course;
import academicSystem.course.Discipline;
import academicSystem.course.DisciplineInterface;
import academicSystem.library.Book;
import academicSystem.library.BookInterface;

@Entity
@PrimaryKeyJoinColumn (name = "id")
public class Student extends Person implements BookInterface, DisciplineInterface {
	protected int period;
	protected double income;
	@ManyToOne
	@JoinColumn(name="course_id")
	protected Course course;
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "students")
	protected List<Discipline> disciplines = new ArrayList<>();
	
	public Student(Course course) {
		super();
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
	
	public int periodsMissing(){
		return course.getPeriods() - period;
	}
	
	public int getCreditsCoursed(){
		int creditsCoursed = 0;
		
		for(Discipline discipline : disciplines){
			creditsCoursed += discipline.getCredits();
		}
		
		return creditsCoursed;
	}
}
