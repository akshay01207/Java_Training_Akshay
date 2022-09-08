package com.polymorphism;

public class Rectangle extends Shape{
	int length;
	int breadth;
	
	public double calculateArea() {
		return length*breadth;
	}
	
	public Rectangle(int length, int breadth) {
		super("Rectangle");
		this.length=length;
		this.breadth=breadth;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length=length;
	}

}
