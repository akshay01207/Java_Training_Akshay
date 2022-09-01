package basicPrograms;

import java.util.Scanner;

public class isPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		boolean isPrime=true;
		
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				isPrime=false;
				break;
			}
		}
		System.out.println("isPrime "+ isPrime);

	}

}
