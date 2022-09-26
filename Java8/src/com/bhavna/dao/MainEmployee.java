package com.bhavna.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.bhavna.bean.Employee;

public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee(101,"akshay", 60);
		Employee emp2=new Employee(102,"arpit", 58);
		Employee emp3=new Employee(103,"vishal", 70);
		Employee emp4=new Employee(104,"ekjot", 65);
		Employee emp5=new Employee(105,"manisha", 55);
		
		List<Employee> listEmployee= new ArrayList<Employee>();
		
		listEmployee.add(emp1);
		listEmployee.add(emp2);
		listEmployee.add(emp3);
		listEmployee.add(emp4);
		listEmployee.add(emp5);
		
		
		System.out.println("================Filter===============");
		List<Employee> list1= listEmployee.stream()
				.filter(emp->emp.getName().startsWith("m"))
				.collect(Collectors.toList());
		
		System.out.println(listEmployee);
		System.out.println(list1);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println("================Sorted===============");
		List<Employee> list2= listEmployee.stream()
				.sorted()
				.collect(Collectors.toList());
				System.out.println("Sorted List");
				
				System.out.println(listEmployee);
				System.out.println(list2);
				
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

	}

}
