package com.bhavna.springcore.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhavna.springcore.bean.Exam;
import com.bhavna.springcore.bean.Student;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");

		ApplicationContext appContextObj = new ClassPathXmlApplicationContext(
				"com/bhavna/springcore/resources/my_spring_bean_configuration_student_exam.xml");
		Student student = (Student) appContextObj.getBean("student");
		System.out.println(student);

//		  Student student1 = (Student) appContextObj.getBean("stud1");
//		  System.out.println(student1);
		Exam exam = (Exam) appContextObj.getBean("exam");
		System.out.println(exam);
		/*
		 * Exam exam1 = (Exam) appContextObj.getBean("exam"); System.out.println(exam1);
		 */

	}

}
