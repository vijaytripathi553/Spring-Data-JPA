package com.lara.cruddev;

import java.util.ArrayList;
import java.util.List;

public class Company {
private List<Employee> employees=new ArrayList<Employee>();
private List<Integer> empids=new ArrayList<Integer>();
public List<Employee> getEmployees() {
	return employees;
}
public void setEmployees(List<Employee> employees) {
	this.employees = employees;
}
public List<Integer> getEmpids() {
	return empids;
}
public void setEmpids(List<Integer> empids) {
	this.empids = empids;
}
@Override
public String toString() {
	return "Company [employees=" + employees + ", empids=" + empids + "]";
}
}

