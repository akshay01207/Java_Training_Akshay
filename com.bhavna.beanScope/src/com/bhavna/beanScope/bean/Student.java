package com.bhavna.beanScope.bean;

import java.util.List;

public class Student {
	private int rollno;
	private String name;
	private double salary;
	private List<String> branches;

	public List<String> getBranches() {
		return branches;
	}

	public void setBranches(List<String> branches) {
		this.branches = branches;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", salary=" + salary + "]";
	}
	
	public Student() {
		super();
	}
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
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

