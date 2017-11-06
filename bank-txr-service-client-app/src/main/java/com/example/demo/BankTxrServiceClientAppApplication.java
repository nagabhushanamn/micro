package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class BankTxrServiceClientAppApplication {

	public static void main(String[] args) {

		TxrRequest request = new TxrRequest();
		request.setAmount(600.00);
		request.setFrom("2");
		request.setTo("1");

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<TxrResponse> resp = restTemplate.postForEntity("http://localhost:8080/txr", request,TxrResponse.class);
		TxrResponse response = resp.getBody();
		System.out.println(response.getStatus());
		
	}
}
