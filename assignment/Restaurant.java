package com.bhavna.assignment;

import java.lang.Math;
import java.util.ArrayList;
import java.util.List;  

public class Restaurant {
	private int latitude;
	private int longitude;
	public int getLat() {
		return latitude;
	}
	public void setLat(int lat) {
		this.latitude = lat;
	}
	public int getLongitude() {
		return longitude;
	}
	public void setLongi(int longitude) {
		this.longitude = longitude;
	}
	public Restaurant(int lattitude, int longitude) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
	}
	public Restaurant() {
		// TODO Auto-generated constructor stub
	}
	public int getRadius() {
		int n= (int)Math.random();
		return n ;
	}
	public List restraunt() {
		 List<String> list=new ArrayList<String>();
		    list.add("XYZ restraunt");
		    list.add("West Hotel");
		    list.add(" XUV Hotel");
		    list.add("Noida Restraunt");
		    list.add("Restraunt 2.0");
		    list.add("MC Restraunt");
		    list.add("Agarwal Sweets");
		    list.add("MC DO Well Restro");
		    return list;
	}
}
