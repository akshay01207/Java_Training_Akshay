package com.bhavna.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhavna.component.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		System.out.println("Employee");
		// TODO Auto-generated method stub
		ApplicationContext ac= new ClassPathXmlApplicationContext("com/bhavna/resources/annotation_configuration_bean.xml");
		Employee employee= (Employee)ac.getBean("empObject");
		System.out.println(employee);

	}

}
