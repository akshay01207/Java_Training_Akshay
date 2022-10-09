package com.bhavna.annotations.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhavna.annotations.components.Employee;

public class TestServices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/bhavna/annotations/resources/annotation_config.xml");
		
		  EmployeeServices obj=new EmployeeServices();
		  obj.addEmployee();
		 System.out.println(obj);
     
	}

}
