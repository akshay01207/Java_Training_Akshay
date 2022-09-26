package com.bhavna.terminalMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyStreamForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=	Arrays.asList(10,20,30,40,50);
		numbers.stream()
		.map(num->num+num+num)
		.collect(Collectors.toList())
		.forEach(no->System.out.println(no));
		}

}
