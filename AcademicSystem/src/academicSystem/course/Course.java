package academicSystem.course;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import academicSystem.people.Student;

@Entity
public class Course implements DisciplineInterface {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private int credits;
	private int periods;
	private int code;
	@OneToMany(mappedBy = "course", targetEntity = Student.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Student> students = new ArrayList<>();
	@OneToMany(mappedBy = "course", targetEntity = Discipline.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Discipline> disciplines = new ArrayList<>();

	public Course(int code) {
		this.code = code;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public int getPeriods() {
		return periods;
	}

	public void setPeriods(int periods) {
		this.periods = periods;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void addStudent(Student student) {
		this.students.add(student);
	}

	public List<Discipline> getDisciplines() {
		return this.disciplines;
	}

	public void addDiscipline(Discipline discipline) {
		this.disciplines.add(discipline);
	}
}
