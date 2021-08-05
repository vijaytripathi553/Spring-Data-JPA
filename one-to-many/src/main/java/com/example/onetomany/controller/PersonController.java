package com.example.onetomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.onetomany.entity.Person;
import com.example.onetomany.service.PersonService;

@RestController
@RequestMapping("/Person")
public class PersonController {
	@Autowired
	private PersonService personService;
	
	
	@PostMapping("/save")
	public Person save(@RequestBody Person person)
	{
		return personService.save(person);
	}
	
	@GetMapping("/readAll")
	public List<Person> readAll()
	{
		return personService.readAll();
	}
	
	@GetMapping("/{id}")
	public Person read(@PathVariable Long id)
	{
		return personService.read(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public Long delete(@PathVariable Long id)
	{

		personService.deleteById(id);
		return id;
	}
}
