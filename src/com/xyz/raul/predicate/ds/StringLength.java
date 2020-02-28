package com.xyz.raul.predicate.ds;

import java.util.function.Predicate;

public class StringLength {
/*
 * Prog to check whether the string length is greater than 5
 * */
	public static void main(String[] args) {
		Predicate<String> lengthChecker = s -> s.length() > 5;
		String val = "Bibek";
		String val1 = "Ashwin";
		System.out.println("Using Predicate checking the length of the string "+val+ "is greater thann 5 "+lengthChecker.test(val));
		System.out.println("Using Predicate checking the length of the string "+val1+ "is greater thann 5 "+lengthChecker.test(val1));

	}

}
