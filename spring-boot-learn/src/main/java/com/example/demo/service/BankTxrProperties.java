package com.example.demo.service;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my.bank")
public class BankTxrProperties {

	@Max(value = 10000)
	private int txrLimit;
	@NotNull
	private String txrType;

	public String getTxrType() {
		return txrType;
	}

	public void setTxrType(String txrType) {
		this.txrType = txrType;
	}

	public int getTxrLimit() {
		return txrLimit;
	}

	public void setTxrLimit(int txrLimit) {
		this.txrLimit = txrLimit;
	}

}
