package com.bhavna.springcore.bean;

public class ExamNew {
	    private int Eid;
	    private String name;
	    private int marks;

	   @Override
	    public String toString() {
	        return "Exam [Eid=" + Eid + ", name=" + name + ", marks=" + marks + "]";
	    }


	   public ExamNew(int eid, String name, int marks) {
	        super();
	        Eid = eid;
	        this.name = name;
	        this.marks = marks;
	    }
	    
	}

