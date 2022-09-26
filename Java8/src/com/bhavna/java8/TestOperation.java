package com.bhavna.java8;

public class TestOperation {
	public static void main(String[] args) {  
        
        // Multiple parameters in lambda expression  
        Operation ad1=(num1,num2)->(num1+num2);  
        System.out.println(ad1.add(10,20));  
          
        // Multiple parameters with data type in lambda expression  
        Operation ad2=(int num1,int num2)->(num1+num2);  
        System.out.println(ad2.add(100,200));  
    }  
}  