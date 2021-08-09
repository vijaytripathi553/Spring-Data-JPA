package com.example.onetomany.service;

import java.util.List;

import com.example.onetomany.entity.MailAccount;
import com.example.onetomany.entity.Person;

public interface MailAccountService {

	// INSERT
	public MailAccount save(MailAccount mailAccount);

	// DISPLAY
	public List<MailAccount> readAll();

	// Find By Id
	public MailAccount read(Long id);

	// DELETE
	public Long deleteById(Long id);

}
