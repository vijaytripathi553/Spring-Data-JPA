package com.example.onetomany.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.onetomany.entity.MailAccount;

public interface MailAccountRepository extends CrudRepository<MailAccount, Long> {

}
