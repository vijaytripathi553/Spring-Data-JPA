package com.lara.onetoone.repository;

import org.springframework.data.repository.CrudRepository;

import com.lara.onetoone.entity.Address;

public interface AddressRepository extends CrudRepository<Address, Integer> {

}
