package com.bridgelabz;

import java.util.Scanner;

public class Hospital {
	Scanner sc = new Scanner(System.in);

	Patient patient() {
		Patient person = new Patient();
		System.out.println("Enter the name");
		person.setFirstName(sc.next());
		System.out.println("Enter the age");
		person.setAge(sc.nextInt());
		System.out.println("Enter the department");
		person.setDepartment(sc.next());
		System.out.println("Enter the phonenumber");
		person.setPhoneNumber(sc.nextLong());
		System.out.println("Enter the city");
		person.setCity(sc.next());
		System.out.println("Enter the state");
		person.setState(sc.next());
		System.out.println("The person Detailes Are:--" + person);
		return person;
	}

}
