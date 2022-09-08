package com.dataStructure;

public class MyCompanyArrayOfObject {

	public static void main(String[] args) {
		
		Company comp[];
		comp=new Company[3];
//		cid + " " + name + " " + city + " " + turnover + " " + noOfEmployee
		comp[0]=new Company(101, "bhavna", "noida", 80, 200 );
		comp[1]=new Company(102, "bhavnaCorp", "noida", 85, 250 );
		comp[2]=new Company(103, "bhavna", "noida", 80, 200 );
		
		for(Company comp1:comp) {
			comp1.display();
		}
		System.out.println("Display All Companies");
		
		System.out.println("Display All Companies having employee greater than 100");
		for(Company comp1:comp) {
			if(comp1.getNoOfEmployee()>=100)
				comp1.display();
		}
	}
	System.out.println("Display All Companies  from Patan");
	String city="Patna";
	boolean flag=false;
	for(Company comp1:comp) {
		if(city.equals(city)) {
			flag = true;
		}
		if(!flag) {
			System.out.println("No record found");
		}
	}

}
