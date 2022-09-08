package com.dataStructure;

//Write Program to accept the Company records as cId,name,city,turnover,number of emloyees and
//1.Display All Companies
//2.Display All Companies having employee greater than 100
//3. Display All Companies  from Patan
//4. Display All Companies Record having turnover between 1000-10000

public class Company {
	private int cid;
	private String name;
	private String city;
	private double turnover;
	private int noOfEmployee;
	
	
	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public double getTurnover() {
		return turnover;
	}


	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}


	public int getNoOfEmployee() {
		return noOfEmployee;
	}


	public void setNoOfEmployee(int noOfEmployee) {
		this.noOfEmployee = noOfEmployee;
	}


	public Company(int cid, String name, String city, double turnover, int noOfEmployee ) {
		this.cid=cid;
		this.name=name;
		this.city=city;
		this.turnover=turnover;
		this.noOfEmployee=noOfEmployee;
	}
	public Company() {
		public void display() {
			System.out.println(cid + " " + name + " " + city + " " + turnover + " " + noOfEmployee);
		}
	}
}
