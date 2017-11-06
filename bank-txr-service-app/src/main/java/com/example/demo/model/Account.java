package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonIgnore;

@XmlRootElement
@Entity
@Table(name = "ACCOUNTS")
public class Account  extends ResourceSupport{

	@Id
	private String num;
	private double balance;
	@Enumerated(EnumType.STRING)
	private AccountType type;

	@XmlTransient
	@JsonIgnore
	@OneToMany(mappedBy = "account", targetEntity = Txn.class,fetch=FetchType.LAZY)
	private List<Txn> txns;

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

	public List<Txn> getTxns() {
		return txns;
	}

	public void setTxns(List<Txn> txns) {
		this.txns = txns;
	}

}
