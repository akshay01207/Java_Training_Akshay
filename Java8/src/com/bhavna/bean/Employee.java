package com.bhavna.bean;

public class Employee {
	private int eId;
	private String name;
	private double salary;
	
	public Employee(int eId, String name, double salary) {
		super();
		this.eId = eId;
		this.name = name;
		this.salary = salary;
	}
	
	public int geteId() {
		return eId;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
//	public int compareTo(Employee o) {
//		if(this.salary > o.salary)
//			return -1;
//		else if(this.salary < o.salary)
//			return 1;
//		else
//			return 0;
//	}
	

	@Override
	public String toString() {
		return "Emplyee [eId=" + eId + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
