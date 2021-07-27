package com.lara.onetoone.service;

import java.util.List;

import com.lara.onetoone.entity.Person;

public interface PersonService {
	//INSERT
	public Person save(Person person);
	
	
	//DISPLAY
	public List<Person> readAll();
	
	
	//Find By Id
	public Person read(Integer id);
	
	
	//DELETE
	public  Person deleteById(Person person);
	
}
