package academicSystem.course;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import academicSystem.people.*;

@Entity
public class Discipline {
	@Id
	@GeneratedValue
	private long id;
	private int code;
	private String name;
	private int credits;
	private int period;
	private String classroom;
	@OneToMany
	private List<Discipline> requirements = new ArrayList<>();
	@ManyToOne
	private Course course;
	@ManyToOne
	private Teacher teacher;
	@ManyToMany
	private List<Student> students = new ArrayList<>();
	
	public Discipline(Course course, int code) {
		this.course = course;
		this.code = code;
	}

	public long getId() {
		return id;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
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

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public String getClassroom() {
		return classroom;
	}

	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

	public List<Discipline> getRequirements() {
		return requirements;
	}

	public void addRequirement(Discipline requirement) {
		this.requirements.add(requirement);
	}

	public Course getCourse() {
		return course;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void addStudent(Student student) {
		this.students.add(student);
	}
}
