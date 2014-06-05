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

	public Course(int code, int credits) {
		this.code = code;
		this.credits = credits;
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
		if(periods == 8 || periods == 10)
			this.periods = periods;
		else
			System.out.println("Este não é um valor válido de períodos!");
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
		if(getTotalCredits() + discipline.getCredits() > this.credits)
			System.out.println("Creditos do curso excedidos!");
		else
			this.disciplines.add(discipline);
	}
	
	private int getTotalCredits() {
		int totalCredits = 0;
		
		for(Discipline discipline : this.disciplines) {
			totalCredits+=discipline.getCredits();
		}
		
		return totalCredits;
	}
}
