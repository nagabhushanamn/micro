package com.example.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Employee;

@Repository
@Transactional
public class EmployeeRepository {

	@PersistenceContext
	private EntityManager em;

	public void save(Employee employee) {
		em.persist(employee);
	}

	public List<Employee> findAll() {
		String jpql = "from Employee";
		Query query = em.createQuery(jpql);
		return query.getResultList();
	}
}
