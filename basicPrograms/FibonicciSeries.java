package basicPrograms;

import java.util.Scanner;

public class FibonicciSeries {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		
		int a=0;
		int b=1;
		
		System.out.println(a + " ");
		System.out.println(b + " ");
		
		for(int i=0;i<n-1; i++) {
			int c=a+b;
			System.out.println(c + " ");
			a=b;
			b=c;
		}
	}
}
