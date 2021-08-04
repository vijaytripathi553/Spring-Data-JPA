package com.lara.onetoone.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private int id;
	private String first_name;
	private String last_name;
	
	//Bi-Directional OneToOne
	//Step1: specify mapped by = 
	@OneToOne(mappedBy = "person", cascade=CascadeType.ALL)
	private Address address;
	
	// STEP 2: Getters and Setters
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	

}
