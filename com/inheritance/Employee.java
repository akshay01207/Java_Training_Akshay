package com.inheritance;

public class Employee extends Person {
	int eid;
	String company;
	int salary;
	
	public Employee(String Name,int age, String Address, eid, String company, int salary) {
		super(Name, age, Address);
		this.eid=eid;
		this.company=company;
		this.salary=salary;
	}

}
