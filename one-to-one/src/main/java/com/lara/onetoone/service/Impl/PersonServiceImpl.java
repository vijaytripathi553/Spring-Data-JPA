package com.lara.onetoone.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.lara.onetoone.entity.Person;
import com.lara.onetoone.repository.PersonRepository;
import com.lara.onetoone.service.PersonService;
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
	public Person read(Integer id) {
		return personRepository.findById(id).get();
	}

	@Override
	public Person deleteById(Person person) {
		personRepository.delete(person);
		return person;
	}

	

}
	