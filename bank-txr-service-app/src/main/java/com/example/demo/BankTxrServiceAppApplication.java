package com.example.demo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.repository.TxnRepository;
import com.example.demo.service.TxrService;
import com.example.demo.model.*;

@SpringBootApplication
public class BankTxrServiceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankTxrServiceAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner test(TxrService txrService, TxnRepository txnRepository) {

		return args -> {

			txrService.txr(500.00, "1", "2");

			// List<Txn> txns=txnRepository.listAll("1");
			// System.out.println(txns.size());

		};

	}

}
