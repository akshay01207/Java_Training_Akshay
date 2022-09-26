package com.bhavna.java8;

import java.util.function.Consumer;

public class MyConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> ref=(num)->{
			if(num%2==0) {
				System.out.println("its Even Number");
			}else {
				System.out.println("its Odd Number");
			}
		};
		
		ref.accept(10);
		ref.accept(15);
		ref.accept(100);
	}

}
