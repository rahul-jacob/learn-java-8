package com.xyz.raul.biconsumer.dilip;

import java.util.function.BiConsumer;

public class BiConsumerExample {
	
	public static BiConsumer<Double,Double> add = (x,y) -> System.out.println("Sum is "+(x+y));
	public static BiConsumer<Double,Double> subtract = (x,y) -> System.out.println("Difference is "+(x-y));
	public static BiConsumer<Double,Double> multiply = (x,y) -> System.out.println("Product is "+x*y);
	public static BiConsumer<Double,Double> division = (x,y) -> System.out.println("Quotient is "+x/y);
	public static BiConsumer<Double,Double> modulo = (x,y) ->  System.out.println("Remainder is "+x%y);

	public static void main(String[] args) {
		double a = 14.1;
		double b = 10;
		System.out.println("Finding the sum and subtract");
		add.andThen(subtract).andThen(multiply).andThen(division).accept(a, b);//Consumer Chaining.
		modulo.accept(a, b);//Consumer
	}

}
