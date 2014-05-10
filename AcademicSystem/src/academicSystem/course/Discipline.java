package academicSystem.course;

import java.util.List;

public class Discipline {
	private long id;
	private int code;
	private int credits;
	private int period;
	private String classroom;
	private List<Discipline> requirements;
	
	public Discipline() {

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
}
