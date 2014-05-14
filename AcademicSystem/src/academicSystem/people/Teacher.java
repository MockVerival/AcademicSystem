package academicSystem.people;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

import academicSystem.course.Discipline;
import academicSystem.course.DisciplineInterface;
import academicSystem.library.Book;
import academicSystem.library.BookInterface;

@Entity
@PrimaryKeyJoinColumn (name = "id")
public class Teacher extends Employee implements BookInterface, DisciplineInterface {
	protected int maxCredits;
	@OneToMany(mappedBy = "teacher", targetEntity = Discipline.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	protected List<Discipline> disciplines = new ArrayList<>();
	
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
