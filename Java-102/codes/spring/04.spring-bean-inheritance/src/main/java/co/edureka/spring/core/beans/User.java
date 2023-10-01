package co.edureka.spring.core.beans;

public class User {
	private String firstName;
	private String lastName;

	public User() {	}

	public User(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return String.format("User [First Name= %-10s | Last Name= %-10s]", firstName, lastName);
	}

	public void myInit1() {
		System.out.println("user defined initialization-1");
	}
	public void myInit2() {
		System.out.println("user defined initialization-2");
	}	
	public void myDestructor() {
		System.out.println("user defined destructor");
	}	
}
