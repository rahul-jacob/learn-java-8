package com.xyz.raul.function.ds;

import java.util.function.Function;

public class FunctionJoining {
	/*
	 * For Joining functions we have 2 default methods
	 * 1. andThen 
	 * f1.andThen(f2).apply(T t) -> Here f1 gets invoked and then f2 gets invoked
	 * 2. compose
	 * f1.compose(f2).apply(T t) -> Here f2 gets invoked and then f1 gets invoked
	 * 
	 * The only difference b/w andThen and compose is the order in which the functions are getting invoked.
	 */
	public static void main(String[] args) {
		Function<Integer,Integer> doubleFn = n -> n*2;
		Function<Integer,Integer> cubeFn = n -> n*n*n;
		
		System.out.println(String.format("Output of function chaining using andThen %1d for the input %2d",doubleFn.andThen(cubeFn).apply(2),2));
		System.out.println(String.format("Output of function chaining using decompose %1d for the input %2d",doubleFn.compose(cubeFn).apply(2),2));

	}

}
