package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("txrService")
public class TxrServiceImpl implements TxrService {

	@Autowired
	private BankTxrProperties bankTxrProperties;
	
	public void txr() {
		System.out.println("txring by "+bankTxrProperties.getTxrType());
	}
	
}
