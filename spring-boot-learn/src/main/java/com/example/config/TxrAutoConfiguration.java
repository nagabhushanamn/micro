package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

import com.example.demo.service.BankTxrProperties;
import com.example.demo.service.TxrService;

@Configuration
@ConditionalOnProperty(name = "txr-type", prefix = "my.bank")
public class TxrAutoConfiguration {

	@Autowired
	private BankTxrProperties props;

}
