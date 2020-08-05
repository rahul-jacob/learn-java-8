package com.xyz.raul.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.xyz.raul.pojo.Developer;
import com.xyz.raul.pojo.Item;
import com.xyz.raul.pojo.Owner;
import com.xyz.raul.pojo.Person;
import com.xyz.raul.pojo.Pet;
import com.xyz.raul.pojo.Student;



public final class Java8Util {
	
	public static List<Person> getPersons(){
		List<Person> personList = new ArrayList<Person>();
		Person p = new Person(1001,"Sachin","Tendulkar","M");
		Person p1 = new Person(1002,"Shekar","Dhavan","M");
		Person p2 = new Person(1003,"M.S","Dhoni","M");
		Person p3 = new Person(1004,"Mithali","Raj","F");
		Person p4 = new Person(1005,"Rohit","Sharma","M");
		personList.add(p);
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		personList.add(p4);
		return personList;
	}
	
	
	public static List<Integer> getIntegerList(){
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(10);
		integerList.add(28);
		integerList.add(0);
		integerList.add(-4);
		integerList.add(199);
		return integerList;
	}
	
	public static List<Developer> getDevelopers(){
		List<Developer> devList = new ArrayList<Developer>();
		devList.add(new Developer("Lee","Python","53000",3));
		devList.add(new Developer("James","Ruby","33000",1));
		devList.add(new Developer("Susan","DevOps","53000",2));
		devList.add(new Developer("Sean","Java","93000",5));
		devList.add(new Developer("Charles","VB","23000",1));
		devList.add(new Developer("Tom","Java","23000",2));
		devList.add(new Developer("Mark","Python","13000",1));
		devList.add(new Developer("John","Ruby","3000",1));
		return devList;
	}
	
	public static List<Student> getStudents(){
		List<Student> studList = new ArrayList<Student>();
		studList.add(new Student("Varghese", 40));
		studList.add(new Student("George", 60));
		studList.add(new Student("Ken", 88));
		studList.add(new Student("Victor", 62));
		studList.add(new Student("Jane", 20));
		studList.add(new Student("Michael", 83));
		studList.add(new Student("Alex", 56));
		studList.add(new Student("Abdul", 43));
		return studList;
	}

	public static List<Person> getDuplicateEntryPersons(){
		List<Person> personList = new ArrayList<Person>();
		Person p = new Person(1001,"Sachin","Tendulkar","M");
		Person p1 = new Person(1002,"Shekar","Dhavan","M");
		Person p2 = new Person(1003,"M.S","Dhoni","M");
		Person p3 = new Person(1004,"Mithali","Raj","F");
		Person p4 = new Person(1005,"Rohit","Sharma","M");
		Person p5 = new Person(1006,"Rahul","K.L","M");
		Person p6 = new Person(1007,"Rohit","Sharma","M");
		Person p7 = new Person(1008,"Rahul","K.L","M");
		Person p8 = new Person(1009,"Shekar","Dhavan","M");
		personList.add(p);
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		personList.add(p4);
		personList.add(p5);
		personList.add(p6);
		personList.add(p7);
		personList.add(p8);
		return personList;
	}
	
	public static List<String> getListOfStrings(){
		List<String> retList = new ArrayList<String>();
		String[] arrItems = {"Basketball","Football","Carroms","Football","Carroms","Chess","Hockey","Batminton","Tennis","Chess","Cricket"};
		Arrays.stream(arrItems).forEach(s -> retList.add(s));
		return retList;
	}
	
	public static List<Developer> getDevelopersInfo(){
		List<Developer> devList = new ArrayList<Developer>();
		devList.add(new Developer("Aravind", "Python", "10000", 3));
		devList.add(new Developer("Sandy", "Java", "9500", 1));
		devList.add(new Developer("Anandd", "Android", "11000", 2));
		devList.add(new Developer("Vishnu", "Java", "45000", 4));
		devList.add(new Developer("Sam", "C++", "17000", 3));
		devList.add(new Developer("Anita", "Python", "9500", 1));
		devList.add(new Developer("Basil", "Python", "2900", 0));
		return devList;
	}
	
	public static List<Item> getItems(){
		return Arrays.asList(
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 20, new BigDecimal("19.99")),
                new Item("orange", 10, new BigDecimal("29.99")),
                new Item("watermelon", 10, new BigDecimal("29.99")),
                new Item("papaya", 20, new BigDecimal("9.99")),
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 10, new BigDecimal("19.99")),
                new Item("apple", 20, new BigDecimal("9.99"))
        );
	}
	
	public static List<Owner> getOwnerList(){
		Owner owner1 = new Owner("John", "USA", "NYC", new Pet("Max", 5));
		Owner owner2 = new Owner("Steve", "UK", "London", new Pet("Lucy", 8));
		Owner owner3 = new Owner("Anna", "USA", "NYC", new Pet("Buddy", 12));
		Owner owner4 = new Owner("Mike", "USA", "Chicago", new Pet("Duke", 10));
	    return Arrays.asList(owner1, owner2, owner3, owner4);
	}

}
