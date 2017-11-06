package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.service.TxrService;

@SpringBootApplication
public class BankTxrServiceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankTxrServiceAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner test(TxrService txrService) {

		return args -> {
			txrService.txr(500.00, "1", "2");
		};

	}

}
