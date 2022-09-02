package com.inheritance;

import java.util.Scanner;

public class Person {
	private String Name;
	private String Address;
	private int age;
	
	public void getInput() {
		 
		  Scanner in = new Scanner(System.in);
		  System.out.print("Enter the Name :: ");
		  Name = in.next();
		  System.out.print("Enter the Adress :: ");
		  Address = in.next();
		  System.out.print("Enter the age :: ");
		  age = in.nextInt();
		 }
	public void display() {
		  
		  System.out.println("Person name = " + Name);
		  System.out.println("Person address = " + Address);
		  System.out.println("person age = " + age);
		 }
}
