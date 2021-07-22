package com.example.datajpa2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	@Autowired
	private PersonRepository personRepository;
	
	@PostMapping("save")
	public Person save(@RequestBody Person p)        				  //Save()
	{
		personRepository.save(p);
		return p;
	}
	
	// This is API to save multiple Person objects
	@PostMapping("savePersons")
	public String saveAll(@RequestBody AllPersons allPersons)
	{
		personRepository.saveAll(allPersons.getPp());  				 // SaveAll()
		return "success";
	}
	
	// This API is used for Updating the record. Same Save() method is used for even updating the record.Except method= RequestMethod.PUT
	@RequestMapping(path="update", method=RequestMethod.PUT)
	public String update(@RequestBody Person p)
	{
		personRepository.save(p);									// Put()
		
		return"Updating the record";
	}
	
	
	//This API is developed to read all the records from table
	@RequestMapping(path="readAll", method=RequestMethod.GET)
	public List<Person> readAll()
	{
		return(List<Person>) personRepository.findAll();			//findAll()
	}
	
	//This API is developed to read specific records from table
	@RequestMapping(path="read/{id}", method=RequestMethod.GET)
	public Person read (@PathVariable Integer id)
	{
		return personRepository.findById(id).get();
	}
	
	
	/*  From here we are going to develop Advance Custom Repository method  */
	

}
