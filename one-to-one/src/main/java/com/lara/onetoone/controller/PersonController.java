package com.lara.onetoone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lara.onetoone.entity.Person;
import com.lara.onetoone.service.PersonService;

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
	public Person read(@PathVariable Integer id)
	{
		return personService.read(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public Person delete(@PathVariable Person person)
	{

		personService.deleteById(person);
		return person;
	}

}
