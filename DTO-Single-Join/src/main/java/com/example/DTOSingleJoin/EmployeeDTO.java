package com.example.DTOSingleJoin;

public class EmployeeDTO {
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private String genderName;
	
	public EmployeeDTO(int id, String firstName, String lastName, int age, String genderName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		// Here in EmployeeDTO we have taken genderName. Although we had taken GenderId in Employee class  	
		this.genderName = genderName;
	}

	// Now try developing getter methods since we have already set by constructor. There is no use of setters here(optional).
	//As we know we can initialise or set the data member of a class by 2 ways
	//1)By Constructor and 2)by setters and getters

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getGenderName() {
		return genderName;
	}
	

	



	

}
