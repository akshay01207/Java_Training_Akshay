package com.array;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements to be inserted in array: ");
		int n= sc.nextInt();
		int[] arr= new int[n+1];
		System.out.println("Enter Elements in array : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		MyArray obj=new MyArray(arr);
		obj.calculateSum();
		obj.evenOddSum();
	}
}
