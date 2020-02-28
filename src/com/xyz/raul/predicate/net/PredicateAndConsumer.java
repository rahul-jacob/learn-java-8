package com.xyz.raul.predicate.net;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.xyz.raul.pojo.Person;
import com.xyz.raul.util.Java8Util;

public class PredicateAndConsumer {


	public static void main(String[] args) {
		List<Person> personList = Java8Util.getPersons();
		Predicate<Person> personPredicate = ((n) -> n.getGender().equals("F"));
		Consumer<Person> personConsumer = ((n) -> {
			if(personPredicate.test(n)){
				System.out.println(n);
			}
		}
				);
		printVal(personList,personPredicate);
		
		printVal(personList,personConsumer);

	}

	private static void printVal(List<Person> personList,
			Consumer<Person> personConsumer) {
			personList.forEach(personConsumer);
		
	}

	private static void printVal(List<Person> personList,
			Predicate<Person> personPredicate) {
			personList.forEach((n)-> {
				if(personPredicate.test(n)){
					System.out.println(n);
				}
			});
		
	}
}
