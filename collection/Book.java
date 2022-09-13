package com.dataStructure.collection;

//Write program to create get details of book (bookId,name,price,Author) store it into set.
//1. display all boo details
//2. Display books in descending order  of price
//3. implement hashcode and equals method to ensure that only unique record will be 
//    added show demo

public class Book {
	private int bookId;
	private String name;
	private double price;
	private String author;
	
	public Book(int bookId, String name, double price, String author) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.price = price;
		this.author = author;
	}
	
	public Book() {
		super();
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", name=" + name + ", price=" + price + ", author=" + author + "]";
	}


	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}
