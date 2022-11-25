package com.bhavna.operations;

import java.util.ArrayList;

import java.util.List;

public class ZipServiceImplementation extends ZipServiceInterface {
	List<Address> list = new ArrayList<Address>();

	public ZipServiceImplementation() {
		super();
		Address data  = new Address("India", "Haryana", "Gurgaon", 20011);
		Address data2 = new Address("India", "Uttar Pradesh", "Greater Noida", 201308);
		Address data3 = new Address("India", "Uttar Pradesh", "Noida", 201301);
		Address data4 = new Address("India", "Delhi", "New Delhi", 110010);
		Address data5 = new Address("India", "Himanchal Pradesh", "Shimla", 110011);

		list.add(data);
		list.add(data2);
		list.add(data3);
		list.add(data4);
		list.add(data5);
	}

	public void search(long code) {
		
		
		// Get the iterator
//	    Iterator<Address> list = list.iterator();
//	    
//	    while(list.hasNext()) {
//	    	  System.out.println(list.next());
//	    	}
		
		for (Address address : list) {
			if (address.getZipCode() == code)
				System.out.println(address);
		}

	}

	public void allRecord(int records) {
		for (Address address : list)
			System.out.println(address);

	}

}
