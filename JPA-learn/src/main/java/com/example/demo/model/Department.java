package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="DEPARTMENTS")
public class Department {

	private int id;
	private String name;
	
	@OneToMany(mappedBy="department")
	private List<Employee> employees;
	
}
