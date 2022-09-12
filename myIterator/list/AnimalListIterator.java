package com.dataStructure.myIterator.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class AnimalListIterator {

	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		
		list.add("Dog");
		list.add("cat");
		list.add("goat");
		list.add("rat");
		list.add("snak");
		list.add("camil");
		list.add("pegion");
		
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
		System.out.println("USING LIST_ITERATOR");
		

	}

}
