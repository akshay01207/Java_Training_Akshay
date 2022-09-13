package com.dataStructure.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MyBookList {

	public static void main(String[] args) {
		
//		List<Book> list= new ArrayList<Book>();
//		List list= new ArrayList();
		Set<Book> set= new HashSet<Book>();
		
		Book b1 = new Book(101,"Maths", 400, "RK Singh");
		Book b2 = new Book(102,"physics", 500, "PK Singh");
		Book b3 = new Book(103,"chemistry", 300, "Raj Singh");
		Book b4 = new Book(104,"science", 700, "Taj ");
		Book b5 = new Book(105,"computer", 900, "Ram Singh");
		
//		list.add(b1);
//		list.add(b2);
//		list.add(b3);
//		list.add(b4);
//		list.add(b5);
		
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);
		set.add(b5);
		
		for(Book book:set) {
			System.out.println(book);
		}

		Collections.sort(set, Collections.reverseOrder());
		Set resultSet = new LinkedHashSet(set);
		
	}

}
