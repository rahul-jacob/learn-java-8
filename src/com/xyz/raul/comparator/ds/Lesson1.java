package com.xyz.raul.comparator.ds;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import com.xyz.raul.pojo.Person;
import com.xyz.raul.util.Java8Util;

public class Lesson1 {

	public static void main(String[] args) {
		Predicate<Collection> predicateIsEmpty = collection -> collection!=null && !collection.isEmpty();
		List<Person> personList = Java8Util.getPersons();
		if(predicateIsEmpty.test(personList)){
			//Sorting Based on Last Name
			System.out.println("Sorting based on last name using PersonComparator class");
			Collections.sort(personList, new PersonComparator());
			personList.forEach(s->System.out.println(s));
			System.out.println("--------------------------------");
			//Sorting Based on Last Name
			System.out.println("Sorting using first name using anonymous block");
			Collections.sort(personList, new Comparator<Person>() {

				@Override
				public int compare(Person p0, Person p1) {
					return p0.getFirstName().compareTo(p1.getFirstName());
				}
			});
			personList.forEach(personObj -> System.out.println(personObj));
			System.out.println("--------------------------------");
			System.out.println("Sorting using last name using lambda expression");
			Collections.sort(personList, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
			personList.forEach(System.out::println);
		}

	}

}

class PersonComparator implements Comparator<Person> {

	@Override
	public int compare(Person p0, Person p1) {
		return p0.getLastName().compareTo(p1.getLastName());
	}

}
