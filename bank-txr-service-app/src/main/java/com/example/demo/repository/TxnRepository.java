package com.example.demo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Txn;

public interface TxnRepository extends JpaRepository<Txn, Integer> {

	@Query("from Txn t where t.account.num=?1")
	List<Txn> listAll(String accNum);
	
	@Query("from Txn t where t.date=?1")
	List<Txn> listByDate(Date date);
	

}
