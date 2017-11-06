package com.example.demo.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Account;
import com.example.demo.model.Txn;
import com.example.demo.model.TxnType;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.TxnRepository;

@Service("txrService")
public class TxrServiceImpl implements TxrService {

	@Autowired
	private AccountRepository accounRepo;

	@Autowired
	private TxnRepository txnRepo;

	@Transactional
	@Override
	public boolean txr(double amount, String fromAccNum, String toAccNum) {

		Account fromAccount = accounRepo.findOne(fromAccNum);
		Account toAccount = accounRepo.findOne(toAccNum);

		fromAccount.setBalance(fromAccount.getBalance() - amount);
		toAccount.setBalance(toAccount.getBalance() + amount);

		accounRepo.save(fromAccount);

		Txn fromAccTxn = new Txn();
		fromAccTxn.setType(TxnType.DEBIT);
		fromAccTxn.setAmount(amount);
		fromAccTxn.setDate(new Date());
		fromAccTxn.setClosingBalance(fromAccount.getBalance());
		fromAccTxn.setAccount(fromAccount);

		txnRepo.save(fromAccTxn);

		accounRepo.save(toAccount);

		Txn toAccTxn = new Txn();
		toAccTxn.setType(TxnType.CREDIT);
		toAccTxn.setAmount(amount);
		toAccTxn.setDate(new Date());
		toAccTxn.setClosingBalance(toAccount.getBalance());
		toAccTxn.setAccount(toAccount);

		txnRepo.save(toAccTxn);

		return true;
	}

}
