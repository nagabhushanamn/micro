package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ClientNewApplication {

	@Autowired
	private EurekaClient eurekaClient;
	

	@Autowired
	private RestTemplateBuilder restTemplateBuilder;

	public static void main(String[] args) {
		SpringApplication.run(ClientNewApplication.class, args);
	}

	@RequestMapping("/")
	public String getMessage() {

		InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka("service-b", false);
		RestTemplate restTemplate=restTemplateBuilder.build();
		String baseUrl=instanceInfo.getHomePageUrl();
	
		HttpEntity<String> response=restTemplate.exchange(baseUrl, HttpMethod.GET, null, String.class);

		return response.getBody();
		

	}

}
