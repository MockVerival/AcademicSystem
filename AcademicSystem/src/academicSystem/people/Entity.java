package academicSystem.people;

public abstract class Entity {
	protected long id;
	protected int registration;
	protected String name;
	protected String address;
	protected String phone;
	protected String email;
	
	public Entity() {

	}
	
	public long getId() {
		return id;
	}
	
	public int getRegistration() {
		return registration;
	}

	public void setRegistration(int registration) {
		this.registration = registration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
