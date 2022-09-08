package com.array;

public class MyArray {
	
		private int[] arr;

		public MyArray(int[] arr) {
		this.arr=arr;
	}

//		public static void main(String[] args) {      
//	          
//	        //Initialize array   
//	        int [] arr = new int [] {1, 2, 3, 4, 5};   
//	        int sum = 0;  
//	        int count=0;
//	        
//	        int n = 8;
//	        int evenSum = 0;
//	        int oddSum = 0;
//	          
//	        //Loop through the array to calculate sum of elements  
//	        for (int i = 0; i < arr.length; i++) {   
//	           sum = sum + arr[i]; 
//	           count++;
//	        }    
//	        
//	        for (int i = 1; i <= 2 * n; i++) {
//	            // check even & odd using Bitwise AND operator
//	            if ((i & 1) == 0)
//	                evenSum += i;
//	            else
//	                oddSum += i;
//	        }
//	        
//	        System.out.println("Sum of First " + n + " Even numbers = " + evenSum);
//	        
//	        System.out.println("Sum of First " + n + " Odd numbers = " + oddSum);
//	        
//	        System.out.println("Display all the elements of an array: " + count + arr);
//	        System.out.println("Sum of all the elements of an array: " + sum);  
//	    }

//		private static void setArr(int[] arr) {
//			this.arr=arr;
//		}

		public void calculateSum() {
			// TODO Auto-generated method stub
			int sum=0;
			for(int i=0;i<arr.length;i++) {
				sum +=arr[i];
			}
			System.out.println("Sum of Array :"+sum);
			
		}

		public void evenOddSum() {
			// TODO Auto-generated method stub
			int even=0;
			int odd=0;
			for(int i=0;i<arr.length;i++) {
				if(i%2==0)
				even+=arr[i];
				else
					odd+=arr[i];
			}
			System.out.println("Even Sum "+ even);
			System.out.println("Odd Sum "+ odd);
		}  
	}  

