package com.bhavna.main;

import java.util.Scanner;

import com.bhavna.operations.ZipServiceImplementation;

public class ZipMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ZipServiceImplementation obj = new ZipServiceImplementation();

		System.out.println("Enter the zip code");
		long code = sc.nextLong();
		obj.search(code);
		System.out.println("All records are Here");
		int records = sc.nextInt();
		obj.allRecord(records);

	}

}
