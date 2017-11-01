package com.bank.mts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.bank.mts.service.TxrService;

@SpringBootApplication
public class BankMTSApplication {
	public static void main(String[] args) {
		SpringApplication.run(BankMTSApplication.class, args);
	}

}  
