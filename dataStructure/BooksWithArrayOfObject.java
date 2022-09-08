package com.dataStructure;

import java.util.Arrays;

//Whrite Java program to accept record of Books and store in array of object.
//1. Display All Records
//2. Search book by name
//3. Display All Book Record Sorted by price and Name of Book
//4. Display Record  of all Books in decending order of date.

public class BooksWithArrayOfObject {

	public static void main(String[] args) {

		Books b[];
		b= new Books[4];
		b[1]=new Books(101,"maths", 100);
		b[2]=new Books(102,"physics", 300);
		b[3]=new Books(103,"chemistry", 400);
		b[4]=new Books(104,"science", 700);
		
		System.out.println("Display all records: ");
		for(Books book1:b) {
			book1.display();
		}
		Arrays.sort(b);
		System.out.println("After Sorting");
		for(Books book1:b) {
			book1.display();
		}
		

	}

}
