package com.example.onetomany.service;

import java.util.List;

import com.example.onetomany.entity.Person;

public interface PersonService {
	
	//INSERT
		public Person save(Person person);
		
		
		//DISPLAY
		public List<Person> readAll();
		
		
		//Find By Id
		public Person read(Long id);
		
		
		//DELETE
		public  Long deleteById(Long id);
	
	
	

}
