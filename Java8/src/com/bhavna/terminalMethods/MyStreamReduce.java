package com.bhavna.terminalMethods;

import java.util.Arrays;
import java.util.List;

public class MyStreamReduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List numbers=	Arrays.asList(10,20,30,40,50);
		
		int even=numbers.stream()
				.filter(num->num%2==0)
				.reduce(0, (ans, i))->ans+1;
				
				System.out.println(numbers);
				System.out.println(ans);
	}

}
