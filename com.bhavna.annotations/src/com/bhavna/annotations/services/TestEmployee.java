package com.bhavna.annotations.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhavna.annotations.components.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Employee test");
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/bhavna/annotations/resources/annotation_config.xml");
        Employee employee= (Employee)ac.getBean("empObject");
        System.out.println(employee);

	}

}
