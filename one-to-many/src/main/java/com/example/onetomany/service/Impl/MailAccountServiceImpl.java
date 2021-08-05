package com.example.onetomany.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onetomany.entity.MailAccount;
import com.example.onetomany.repository.MailAccountRepository;
import com.example.onetomany.service.MailAccountService;

@Service
public class MailAccountServiceImpl implements MailAccountService {
	
	@Autowired
	private MailAccountRepository mailAccountRepository;

	@Override
	public MailAccount save(MailAccount mailAccount) {
		return mailAccountRepository.save(mailAccount);
	}
	

	@Override
	public List<MailAccount> readAll() {
		return (List< MailAccount>)mailAccountRepository.findAll();
	}

	@Override
	public MailAccount read(Long id) {
		return mailAccountRepository.findById(id).get();
	}

	@Override
	public Long deleteById(Long id) {
		 mailAccountRepository.deleteById(id);
		return id;
	}

}
