package com.bhavna.component;

import org.springframework.stereotype.Component;

@Component("empObject")

public class Employee {
	private int eId;
	private String name;
	private double salary;
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
