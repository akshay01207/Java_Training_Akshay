package com.bhavna.annotations.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhavna.annotations.components.Department;

public class TestDepartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ApplicationContext ac = new ClassPathXmlApplicationContext("com/bhavna/annotations/resources/annotation_config.xml");
	        Department dept= (Department)ac.getBean("department");
	        System.out.println(dept);

		}

}
