package academicSystem.course;

import java.util.List;

import academicSystem.people.*;

public class Discipline {
	private long id;
	private int code;
	private int credits;
	private int period;
	private String classroom;
	private List<Discipline> requirements;
	private Course course;
	private Teacher teacher;
	private List<Student> students;
	
	public Discipline(Course course) {
		this.course = course;
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

	public void setRequirements(List<Discipline> requirements) {
		this.requirements = requirements;
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
