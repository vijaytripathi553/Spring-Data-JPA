package com.example.onetomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.onetomany.entity.MailAccount;
import com.example.onetomany.service.MailAccountService;

@RestController
@RequestMapping("MailAccount")
public class MailAccountController {
	@Autowired
	private MailAccountService mailAccountService;
	
	

	@PostMapping("/save")
	public MailAccount save(@RequestBody MailAccount mailAccount)
	{
		return mailAccountService.save(mailAccount);
	}
	
	@GetMapping("/readAll")
	public List<MailAccount> readAll()
	{
		return mailAccountService.readAll();
	}
	
	@GetMapping("/{id}")
	public MailAccount read(@PathVariable Long id)
	{
		return mailAccountService.read(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public Long delete(@PathVariable Long id)
	{

		mailAccountService.deleteById(id);
		return id;
	}
	

}
