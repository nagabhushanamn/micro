package com.bank.mts.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = { JPAConfig.class })
@ComponentScan(basePackages = { "com.bank.mts.repository,com.bank.mts.service" })
public class MTSConfig {

}
