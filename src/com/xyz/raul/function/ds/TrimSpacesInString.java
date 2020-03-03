package com.xyz.raul.function.ds;

import java.util.function.Function;

public class TrimSpacesInString {

	public static void main(String[] args) {
		Function<String,String> spaceString = str -> str.replaceAll(" ", "");
		
		String str = "Twinkle Twinkle Lit   tle Star";
		System.out.println("After applying function to the string is "+str+" is "+spaceString.apply(str));
		
		str = "Mar    y H  a  d a L  i  tt  le La  mb";
		System.out.println("After applying function to the string is "+str+" is "+spaceString.apply(str));

		str = "Jo   hny joh  ny y  es pa   ppa";
		System.out.println("After applying function to the string is "+str+" is "+spaceString.apply(str));

	}

}
