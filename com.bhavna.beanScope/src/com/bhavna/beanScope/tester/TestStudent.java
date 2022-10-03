package com.bhavna.beanScope.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhavna.beanScope.bean.Student;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");

		ApplicationContext appContextObj = new ClassPathXmlApplicationContext(
				"com/bhavna/beanScope/resources/BeanScopeConfiguration.xml");
		
		Student student = (Student) appContextObj.getBean("stud");
		System.out.println(student);

	}
}
