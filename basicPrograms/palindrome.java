package basicPrograms;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int reverseNo=0;
		while(temp>0) {
			int lastDigit=temp%10;
			reverseNo=reverseNo*10 + lastDigit;
			temp/=10;
		}
		if(reverseNo==n) {
			
		}
		
	}

}
