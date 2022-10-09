package com.bhavna.bean;

public class EmployeeBean {
	private int eId;
	private String name;
	private double salary;

	@Override
	public String toString() {
		return "EmployeeBean [eId=" + eId + ", name=" + name + ", salary=" + salary + "]";
	}

	public EmployeeBean() {
		super();
	}

	public EmployeeBean(int eId, String name, double salary) {
		super();
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

}
