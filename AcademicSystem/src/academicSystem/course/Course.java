package academicSystem.course;

import java.util.List;

import academicSystem.people.Student;

public class Course implements DisciplineInterface {
	private long id;
	private String name;
	private int credits;
	private int periods;
	private int code;
	private List<Student> students;
	private List<Discipline> disciplines;

	public Course() {

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
