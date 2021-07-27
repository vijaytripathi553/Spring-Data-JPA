package com.lara.onetoone.repository;

import org.springframework.data.repository.CrudRepository;

import com.lara.onetoone.entity.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {


}
