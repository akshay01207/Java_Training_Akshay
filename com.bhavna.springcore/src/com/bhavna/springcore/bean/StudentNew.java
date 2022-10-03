package com.bhavna.springcore.bean;


//rollno,name,salary,exam
public class StudentNew {
	    private int rollno;
	    private String name;
	    private double salary;
	    private Exam exam;


	   @Override
	    public String toString() {
	        return "StudentNew [rollno=" + rollno + ", name=" + name + ", salary=" + salary + ", exam=" + exam +"]";
	    }



	   public StudentNew(int rollno, String name, double salary, Exam exam) {
	        super();
	        this.rollno = rollno;
	        this.name = name;
	        this.salary = salary;
	        this.exam=exam;
	    }
	    
	}
