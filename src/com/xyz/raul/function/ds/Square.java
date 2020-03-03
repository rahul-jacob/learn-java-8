package com.xyz.raul.function.ds;

import java.util.function.Function;

public class Square {

	public static void main(String[] args) {
		Function<Integer,Integer> square = n -> n*n;
		System.out.println("Square of 24 is "+square.apply(24));
		System.out.println("Square of 45 is "+square.apply(45));
		System.out.println("Square of 15 is "+square.apply(15));

	}

}
