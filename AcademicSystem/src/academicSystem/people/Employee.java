package academicSystem.people;

public class Employee extends Entity {
	protected double salary;

	public Employee() {

	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
