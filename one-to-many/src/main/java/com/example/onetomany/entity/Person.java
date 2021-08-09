package com.example.onetomany.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Person {
	@Id
	private Long id;
	private String firstName;
	private String lastName;
	
	// This is additional for Bi-directional
	@OneToMany(mappedBy="person", cascade=CascadeType.PERSIST)
	@JsonIgnore
	private List<MailAccount> mailAccounts=new ArrayList<MailAccount>();
	
	
	public List<MailAccount> getMailAccounts() {
		return mailAccounts;
	}
	public void setMailAccounts(List<MailAccount> mailAccounts) {
		this.mailAccounts = mailAccounts;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	

}
