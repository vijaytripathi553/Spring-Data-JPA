package com.example.DTOSingleJoin;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	@Query("select new com.example.DTOSingleJoin.EmployeeDTO(e.id,e.firstName,e.lastName,e.age,g.name) from Employee e inner join Gender g on (e.genderId=g.id)")
	public List<EmployeeDTO> readAllEmployees();

}
