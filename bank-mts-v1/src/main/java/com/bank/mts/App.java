package com.bank.mts;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bank.mts.config.MTSConfig;
import com.bank.mts.service.TxrService;

public class App {

	public static void main(String[] args) {

		// Init

		ConfigurableApplicationContext context = null;
		context = new AnnotationConfigApplicationContext(MTSConfig.class);
		System.out.println("--------------------------------------------");

		TxrService txrService = context.getBean("txrService", TxrService.class);
		boolean b = txrService.txr(4230.00, "2", "1");
		System.out.println(b ? "Enjoy lunch-party" : "Listen-class");

		System.out.println("--------------------------------------------");
		context.close();

	}

}
