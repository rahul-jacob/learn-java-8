package com.xyz.raul.predicate.ds;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateJoiningNumberCheckAndOdd {

	public static void main(String[] args) {
		Predicate<Integer> checkNoGreater = n -> n>9; 
		Predicate<Integer> checkNoOdd = n -> n%2==0;
		System.out.println("--------------------");
		System.out.println("----------  Predicate Joining using and  ----------");
		List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
		numList.forEach( n ->{
			if(checkNoGreater.and(checkNoOdd).test(n)){
				System.out.println(n);
			}
		});
		System.out.println("--------------------");
		System.out.println("----------  Predicate Joining using or  ----------");
		numList.forEach(n -> {
			if(checkNoGreater.or(checkNoOdd).test(n)){
				System.out.println(n);
			}
		});
		
		System.out.println("--------------------");
		System.out.println("----------  Predicate negate  ----------");
		numList.forEach(n -> {
			if(checkNoOdd.negate().test(n)){
				System.out.println(n);
			}
		});
	}

}
