package com.xyz.raul.function.ds;

import java.util.function.Function;

public class StringLength {

	public static void main(String[] args) {
		Function<String,Integer> strLen = str -> str.length();
		
		System.out.println("String length of Jaffer is "+strLen.apply("Jaffer"));
		System.out.println("String length of Jaffer is "+strLen.apply("Princy S"));
		System.out.println("String length of Jaffer is "+strLen.apply("Olivia Susan Jacob"));

	}

}
