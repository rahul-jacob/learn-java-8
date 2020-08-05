package com.xyz.raul.zsample;

import java.util.List;
import java.util.stream.Collectors;

import com.xyz.raul.pojo.Person;
import com.xyz.raul.pojo.Student;
import com.xyz.raul.util.Java8Util;

public class ObjectListToNewObjectList {

	public static void main(String[] args) {
		List<Person> personList = Java8Util.getDuplicateEntryPersons();
		List<Student> studentList = personList.stream()
				.filter(obj -> obj!=null)
				.map(obj -> new Student(obj.getFirstName(),22))
				.collect(Collectors.toList());
		
		studentList.forEach(System.out::println);

	}

}
