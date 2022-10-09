package com.bhavna.tester;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bhavna.entity.EmployeeEntity;

public class TestEmployee {
	public static void main(String[] args) {
		TestEmployee.addEmployee();
//		TestEmployee.updateEmployee();
	}

	public static void addEmployee() {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit1");

		System.out.println("Database Information readed");
		/*
		 * EntityManager entityManager = entityManagerFactory.createEntityManager();
		 * 
		 * EmployeeEntity employee = new EmployeeEntity(103, "akshay", 75);
		 * entityManager.getTransaction().begin(); entityManager.persist(employee);
		 * entityManager.getTransaction().commit(); entityManager.close();
		 */
	}
	
	public static void updateEmployee() {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit1");

		System.out.println("Database Information readed");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EmployeeEntity employee = new EmployeeEntity(103, "arpit", 75);
		entityManager.getTransaction().begin();
//		entityManager.persist(employee);
		entityManager.merge(employee);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}
