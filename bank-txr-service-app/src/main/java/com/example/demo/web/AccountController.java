package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Account;
import com.example.demo.model.Txn;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.TxnRepository;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

@RestController
@RequestMapping(value = "/accounts")
public class AccountController {

	@Autowired
	private AccountRepository accountRepo;

	@Autowired
	private TxnRepository txnRepo;

	@RequestMapping(method = RequestMethod.GET)
	public List<Account> listAccounts() {
		return accountRepo.findAll();
	}

	@RequestMapping(value = "/{num}/txns", method = RequestMethod.GET)
	public List<Txn> listTxns(@PathVariable String num) {
		return txnRepo.listAll(num);
	}

	@RequestMapping(value = "/{num}", method = RequestMethod.GET)
	public HttpEntity<Account> get(@PathVariable String num) {
		Account account = accountRepo.findOne(num);
		account.add(linkTo(methodOn(AccountController.class).listTxns(num)).withRel("txn"));
		return new ResponseEntity<Account>(account, HttpStatus.OK);
	}

}
