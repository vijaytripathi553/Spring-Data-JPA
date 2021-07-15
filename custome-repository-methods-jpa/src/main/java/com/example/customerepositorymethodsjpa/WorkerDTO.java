package com.example.customerepositorymethodsjpa;


// This WorkerDTO class is developed for reading only few attaribute rather then reading the complete attaribute of a Enitity class
// Basically there are 2 ways to initialse the object of the class
//1.) By Constructor Injection
//2.) By Setter Injection
public class WorkerDTO {
	private int wid;
	private String lastName;
	public WorkerDTO(int wid, String lastName) {
		this.wid = wid;
		this.lastName = lastName;
		
		
	}
	public int getWid() {
		return wid;
	}
	public String getLastName() {
		return lastName;
	}
	
	

}
