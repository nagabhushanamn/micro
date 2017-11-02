package com.bank.mts.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.mts.model.Account;
import com.bank.mts.repository.AccountRepository;

@RestController
public class AccountRestController {

	@Autowired
	private AccountRepository accountRepository;

	@RequestMapping("/accounts/{num}")
	public Account get(@PathVariable String num) {
		Account account = accountRepository.load(num); // resource
		return account;
	}

}
