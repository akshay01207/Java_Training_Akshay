package com.bhavna.exception;

import java.util.Scanner;

public class Age {
	
	 public static void checkAge(){
		  Scanner sc=new Scanner(System.in); 
		  System.out.print ("Enter your age: ");
		  int age=sc.nextInt();
		  Age obj=new Age();

		  obj.checkAge (age);

		  sc.close();
	  }

	private void checkAge(int age) {
		// TODO Auto-generated method stub
		
	}
}
