package com.bank.mts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNTS")
public class Account {

	@Id
	private String num;
	@Column(name = "balance")
	private double balance;
	@Enumerated(EnumType.STRING)
	private AccountType type;

	public Account(String num, double balance, AccountType type) {
		super();
		this.num = num;
		this.balance = balance;
		this.type = type;
	}

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public AccountType getType() {
		return type;
	}

	public void setType(AccountType type) {
		this.type = type;
	}

}
