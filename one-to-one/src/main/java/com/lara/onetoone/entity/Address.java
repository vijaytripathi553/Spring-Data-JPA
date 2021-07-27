package com.lara.onetoone.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {
@Id
private Integer id;
private String houseNo;
private String streetName;
@OneToOne
private Person person;  //How this table is related with Person table. Or what is the relationship between Person and Address Table //  Person can have only one address

						//So, When you will run the program automatically P.K field of Person table that is 'id' will be creating as a F.K in Address Table.




public Person getPerson() {
	return person;
}
public void setPerson(Person person) {
	this.person = person;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getHouseNo() {
	return houseNo;
}
public void setHouseNo(String houseNo) {
	this.houseNo = houseNo;
}
public String getStreetName() {
	return streetName;
}
public void setStreetName(String streetName) {
	this.streetName = streetName;
}



}
