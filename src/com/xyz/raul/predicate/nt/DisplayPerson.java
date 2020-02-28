package com.xyz.raul.predicate.nt;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.xyz.raul.pojo.Person;
import com.xyz.raul.util.Java8Util;

public class DisplayPerson {

	public static void main(String[] args) {
		List<Person> personList = new ArrayList<Person>();
		personList=Java8Util.getPersons();
		personList.forEach(p -> System.out.println(p));
		//print the person who is having last name as Sachin
		//We use the Predicate Functional Interface with a method test which accepts an
		//entity <T> and returns boolean value.
		System.out.println("--------------------");
		//printing person who has the id 1004
		printConditionally(personList,p -> p.getId()==1004);
		
		System.out.println("--------------------");
		//printing all guys
		printConditionally(personList, getPersonByGender("M"));
		

	}

	private static void printConditionally(List<Person> personList, Predicate<Person> predicateObj) {
		for(Person personObj : personList){
			if(predicateObj.test(personObj)){
				System.out.println(personObj);
			}
		}
		
	}
	
	private static Predicate<Person> getPersonByGender(String gender){
		return p -> p.getGender().equals(gender);
	}

}
