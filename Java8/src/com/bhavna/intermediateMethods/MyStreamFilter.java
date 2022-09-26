package com.bhavna.intermediateMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyStreamFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> listNames=new ArrayList<String>();
		listNames.add("akshay");
		listNames.add("arpit");
		listNames.add("vishal");
		listNames.add("saumya");
		listNames.add("ekjot");
		
		List listStartWithS=listNames.stream()
//				.filter(name->name.startsWith("a"))
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println(listNames);
		System.out.println(listStartWithS);

	}

}
