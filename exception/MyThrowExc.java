package com.bhavna.exception;

//Write a program to demonstrate the use of throws clause.
//Raise FileNotFoundException , IoException

public class MyThrowExc {
	
	  static void checkAge(int age) throws ArithmeticException {
	    if (age < 18) {
	      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
	    }
	    else {
	      System.out.println("Access granted - You are old enough!");
	    }
	  }
}
