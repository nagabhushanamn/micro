package com.example.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.model.Address;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@SpringBootApplication
public class JpaLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaLearnApplication.class, args);
	}

	@Bean
	public CommandLineRunner test(EmployeeRepository empRepository) {
		return args -> {

			Employee employee = new Employee();
			employee.setId(123);
			employee.setName("Nag");
			employee.setDob(new Date());

			Address officeAddress = new Address();
			officeAddress.setCity("HYD");

			Address homeAddress = new Address();
			homeAddress.setCity("CHN");

			List<Address> addresses = new ArrayList<>();
			addresses.add(officeAddress);
			addresses.add(homeAddress);

			employee.setAddresses(addresses);

			empRepository.save(employee);

		};
	}
}
