package com.bhavna.assignment;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("*****Welcome to ABC Company******");
		System.out.println("#####Register Yourself");
		String name,address;
		int phone;
		System.out.println("\n please enter Your Name");
		name=sc.next();
		System.out.println("\n please enter Your address");
		address=sc.next();
		System.out.println("\n please enter Your phone number");
		phone=sc.nextInt();
		System.out.println("=======Registration Successful========");
		UserDetails obj=new UserDetails(name, address, phone);
		System.out.println("\n \n LoGin Details");
//		System.out.println(obj.getName()+"\n  enter "+obj.getAddress());
		System.out.println("\n  enter the otp sent on "+obj.getPhone());
		int otp=sc.nextInt();
		System.out.println("=======LOGIN Successful========");
		System.out.println("\n Search Restraunt by entering Longitude and Latitude");
		Double latitude=sc.nextDouble();	
		Double longitude=sc.nextDouble();
		Restaurant res=new Restaurant();
		int radius=res.getRadius();
		System.out.println("hii!"+obj.getName());
		System.out.println("*****Searching the restraunts in 1.5Km area near you " );
		List list=res.restraunt();
		if(radius>5) {
			 Iterator<String> iter=list.iterator();
			    while(iter.hasNext()) {
			        System.out.println(iter.next()+" ");
			    }
		}else {
			System.out.println("the Restraunts are less than 5 so extending the area to 2.5 km");
			 Iterator<String> iter=list.iterator();
			    while(iter.hasNext()) {
			        System.out.println(iter.next()+" ");
			    }
		}
	}
}