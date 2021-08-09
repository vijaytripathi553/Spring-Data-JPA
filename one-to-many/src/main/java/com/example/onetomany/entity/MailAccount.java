package com.example.onetomany.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class MailAccount {
	@Id
	private Long id;
	private String userName;
	private String password;
	
	@ManyToOne  //(cascade=CascadeType.ALL) Since will be performing operation from parent(Person) table we don't require cascade=cascadeType.ALL  in child table. Rather it require in Parent table.
	private Person person; 							// Many mail account belonging to one person

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
