package com.dataStructure.myIterator.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Write Program to create new array list , add some animals name in it as String and
//display each element by using
//-simple for -Advanced for - Iterator -ListIterator

public class AnimalsIterator {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("Dog");
		list.add("cat");
		list.add("goat");
		list.add("rat");
		list.add("snak");
		list.add("camil");
		list.add("pegion");
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(5));
	
		
//		Simple For
		
		System.out.println("Simple for loop");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));

		}
		
//		Advance for
		System.out.println("Advance for loop");

		for(Object s:list) {
			System.out.println(s);
		}
//ITERATOR
		System.out.println("Using iterator");
		
		Iterator iterator=list.iterator();
		
		while(iterator.hasNext()) {
			Object o=iterator.next();
			System.out.println(o);
		}
		System.out.println("USING ITERATOR");
		
//		while(iterator.hasPrevious()) {
//			Object o=iterator.next();
//			System.out.println(o);
//		}
		System.out.println("USING ITERATOR");
	}
	
//	ListIterator
	
	

}
