package com.dataStructure.sorting;

public class MainSelection extends SelectionSort {

	public static void main(String[] args) {
		
		  int[] arr1 = {9,14,3,2,43,11,58,22};  
	        System.out.println("Before Selection Sort");  
	        for(int i:arr1){  
	            System.out.print(i+" ");  
	        }  
	        System.out.println();  
	          
	        SelectionSort(arr1);//sorting array using selection sort  
	         
	        System.out.println("After Selection Sort");  
	        for(int i:arr1){  
	            System.out.print(i+" ");  
	        }  
	}



}
