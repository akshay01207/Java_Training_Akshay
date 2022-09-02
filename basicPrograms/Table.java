package basicPrograms;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		
		int i=0;    
		System.out.println("Enter the Number: ");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
	    for(i=5;i<=n;i++){       
	        if(i%5 == 0) 
	            System.out.println(i);
	    } 
	}

}
