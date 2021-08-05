package com.example.onetomany.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.onetomany.entity.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {

}
