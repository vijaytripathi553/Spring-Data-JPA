package com.example.onetomany.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onetomany.entity.Person;
import com.example.onetomany.repository.PersonRepository;
import com.example.onetomany.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonRepository personRepository;
	

	@Override
	public Person save(Person person) {
		return personRepository.save(person);
	}

	@Override
	public List<Person> readAll() {
		return (List<Person>) personRepository.findAll();
	}

	@Override
	public Person read(Long id) {
		return personRepository.findById(id).get();
	}

	@Override
	public Long deleteById(Long id) {
		personRepository.deleteById(id);
		return id;
	}
}