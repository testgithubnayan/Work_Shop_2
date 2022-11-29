package com.bridgelabz;

//Create Hospitals -> Create Patients with details(name, age, phoneNumber,city,state, department)
public class Patient {
	private String firstName;
	private String city;
	private String department;
	private String state;
	private int age;
	private long phoneNumber;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Patient() {

	}

	public String toString() {
		return "\n firstName " + firstName + "\n city" + city + "\n department" + department + "\n state" + state
				+ "\n age" + age + "\n phoneNumber" + phoneNumber;
	}
}
