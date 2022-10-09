package com.bhavna.annotations.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("empObject")
public class Employee {
	@Value("101")
	private int eId;
	@Value("Ram")
	private String name;
	@Value("60")
	private double salary;

	@Value("#{department}")
	private Department dept;

	@Component("department")
	class Department {

	}

	private Department department;
	private Company company;

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Employee(int eId, String name, double salary) {
		super();
		System.out.println("In Employee parameterised constructor");
		this.eId = eId;
		this.name = name;
		this.salary = salary;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", name=" + name + ", salary=" + salary + "]";
	}

}
