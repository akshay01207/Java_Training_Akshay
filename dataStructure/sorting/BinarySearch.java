package com.dataStructure.sorting;

public class BinarySearch {
	public static void binarySearch(int arr[], int low, int high, int key){  
		   int mid = (low + high)/2;  
		   while( low <= high ){  
		      if ( arr[mid] < key ){  
		        low = mid + 1;     
		      }else if ( arr[mid] == key ){  
		        System.out.println("Element is found at index: " + mid);  
		        break;  
		      }else{  
		         high = mid - 1;  
		      }  
		      mid = (low + high)/2;  
		   }  
		   if ( low > high ){  
		      System.out.println("Element is not found!");  
		   }  
		 }  
}
