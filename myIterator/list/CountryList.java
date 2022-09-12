package com.dataStructure.myIterator.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CountryList {

	public static void main(String[] args) {
		
List<String> list= new ArrayList<String>();
		
		list.add("INDIA");
		list.add("Sri Lanka");
		list.add("Pak");
		list.add("Nepal");
		list.add("Bangladesh");
		list.add("America");
		list.add("England");
		
		
		System.out.println("Using iterator");
		
		Iterator iterator=list.iterator();
		
		while(iterator.hasNext()) {
			Object o=iterator.next();
			System.out.println(o);
		}
		
		ListIterator literator=list.listIterator();
		while(literator.hasPrevious()) {
			String name= (String) literator.previous();
			System.out.println(name);
			System.out.println();
		}
		
		ListIterator listIterator = list.listIterator();
		while(listIterator.hasPrevious()) {
			Object o = new Object();
			System.out.println(o);
		}
		
	}

}
