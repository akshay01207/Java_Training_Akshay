package com.bhavna.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Restaurant {

		public void searchHotels (double longitude, double latitude) {

	int n=noOfHotels(); 
	if(n<5) {

	System.out.println("Checking within the radius of 2.5 km");
	
	}else {
		System.out.println("Checking within the radius of 1.5 km");
		}

	}

	private int noOfHotels() {
			// TODO Auto-generated method stub
			return 0;
		}

	public int getRadius() {
		int n=(int)Math.random();
		return n;
	}
	
	public List restraunt() {
	List<String> list=new ArrayList<String>();

	list.add("Raj restraunt");
	list.add("Taj Hotel");

	list.add("Food Walia");

	list.add("kanha Restraunt");
	list.add("Chadda Restraunt");

	list.add("Verma Restraunt");
	list.add("Agarwal Restraunt");

	list.add("Singh Restraunt");

	return list;
	}
}
