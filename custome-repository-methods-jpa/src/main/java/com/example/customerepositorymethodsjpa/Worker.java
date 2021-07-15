package com.example.customerepositorymethodsjpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Worker {
	@Id
	private int wid;
	private String firstName;
	private String lastName;
	
	
	public int getWid() {
		return wid;
	}
	public void setWid(int wid) {
		this.wid = wid;
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
		return "Worker [wid=" + wid + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
	

}
