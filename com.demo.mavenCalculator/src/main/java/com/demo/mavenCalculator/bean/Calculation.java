package com.demo.mavenCalculator.bean;

public class Calculation {
//	int result;
	//Method for addition
	public int add(int num1, int num2){
		int result = num1+num2;
		return result;
	}
	
	public String add(String aks, String hay){
		String result = "aks"+"hay";
		return result;
	}
	
	public double add(double num1, double num2){
		double result = num1+num2;
		return result;
	}
	
	//Method for subtraction
	public int substract(int num1, int num2){
		int result = num1-num2;
		return result;
	}
	//Method for multiplication
	public int multiply(int num1, int num2){
		int result = num1*num2;
		return result;
	}
	//Method for division
	public double divide(double num1, double num2){
		double result = num1/num2;
		return result;
	}
	
}
