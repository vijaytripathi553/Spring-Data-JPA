package com.lara.DTOMultipleJoin;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	@Query("select new com.lara.DTOMultipleJoin.EmployeeDTO(e.id,e.firstName,e.lastName,e.age,g.name) from Employee e inner join Gender g on (e.genderId=g.id)")	public List<EmployeeDTO> readAllEmployees();
	
	
	
	/*
	 * @Query("select new com.lara.DTOMultipleJoin.EmployeeDTO(e.id,e.firstName,e.lastName"
	 * + "e.age,g.name,edu.name) from Employee e inner join Gender g on"+
	 * "(e.genderId=g.id) inner join Education edu on (e.educationId=edu.id)")
	 * public List<EmployeeDTO> readAllEmployees1();
	 */
	  
	/*
	 * @Query("select new com.lara.DTOMultipleJoin. EmployeeDTO(e.id, e.firstName" +
	 * "e.lastName, e.age, g.name, edu.name) from Employee e inner join Gender g on "
	 * + "(e.genderId = g.id) inner join Education edu on (e.educationId = edu.id)")
	 */
	  
	  @Query("select new com.lara.DTOMultipleJoin.EmployeeDTO(e.id,e.firstName,e.lastName,e.age,g.name,edu.name) from Employee e inner join Gender g on (e.genderId=g.id) inner join Education edu on (e.educationId=edu.id)")
		public List<EmployeeDTO> readAllEmployees1();
			

}
