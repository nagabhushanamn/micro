package com.bank.mts.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.mts.model.Account;

@Repository
public class JpaAccountRepository implements AccountRepository {

	@PersistenceContext(type=PersistenceContextType.EXTENDED)
	private EntityManager em;

	public Account load(String num) {
		return em.find(Account.class, num); // select * from mts.ACCOUNTS where num=?
	}

	public void update(Account account) {
		System.out.println(account);
		em.merge(account);
	}

}
