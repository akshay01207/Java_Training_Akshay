package com.bhavna.assignment;

import java.util.Scanner;

public class Account extends UserDetails{
	public void register() {

	Scanner sc=new Scanner(System.in);

	System.out.println("Registration page");

	System.out.print("Enter your name:");
	String name=sc.next();
	
	System.out.print("Enter your email id: ");
	String email=sc.next(); 
	
	System.out.print("Enter your mobile number: "); 
	double mobile=sc.nextDouble();

	System.out.println("\n\t\tRegistration successful");

	}

	public void login() {

	Scanner sc=new Scanner(System.in);
	System.out.print("Enter your mobile number "); 
	
	double mobile=sc.nextDouble();
	
	System.out.print("Enter your Password "); 
	
	int Password=sc.nextInt();

	System.out.println("Enter the otp received on your mobile number ");
	
	int otp=sc.nextInt();

	System.out.println("\n\t\tlog in Successful");
	}
}
