package com.xyz.raul.function.ds;

import java.util.function.Function;

public class CountSpacesInString {

	public static void main(String[] args) {
		Function<String,Integer> spaceFn = str -> str.length() - (str.replaceAll(" ", "")).length();
		
		String str = "Twinkle Twinkle Lit   tle Star";
		System.out.println(String.format("After applying to the string %1s there are %1d spaces",str,spaceFn.apply(str)));
		
		str = "Mar    y H  a  d a L  i  tt  le La  mb";
		System.out.println(String.format("After applying function to the string %1s there are %1d spaces", str,spaceFn.apply(str)));

		str = "Jo   hny joh  ny y  es pa   ppa";
		System.out.println(String.format("After applying function to the string %1s there are %1d spaces",str,spaceFn.apply(str)));
		


	}

}
