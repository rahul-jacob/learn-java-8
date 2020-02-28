package com.xyz.raul.predicate.ds;

import java.util.function.Predicate;

public class NullCheck {

	public static void main(String[] args) {
		Predicate<String> nullChecker = s -> s!=null && !s.isEmpty();
		String[] names = {"Akhil",""," ","Null","Simi","Nidhi","Aravind","Deepu","Ajesh",null};
		for(String str : names){
			if(nullChecker.test(str)){
				System.out.println("Using Predicate str "+str+" is not null");
			}else{
				System.out.println("Using Predicate str "+str+" is null");
			}
		}

	}

}
