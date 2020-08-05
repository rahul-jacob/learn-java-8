package com.xyz.raul.grouping;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.xyz.raul.pojo.Developer;
import com.xyz.raul.util.Java8Util;

public class SampleGroupBy {
	public static BiConsumer<String,List<Developer>> loopMap = (k,v) ->{
		System.out.println("Technology is "+k);
		System.out.println("Developers are is ");
		v.forEach(System.out::println);
		System.out.println("--------------------------------");
	};

	public static void main(String[] args) {
		//Grouping Developer's based on their technology
		List<Developer> developerList = Java8Util.getDevelopersInfo();
		Map<String, List<Developer>> developerTechnology = developerList.stream().collect(Collectors.groupingBy(Developer::getTechnology));
		developerTechnology.forEach(loopMap);
		
		//Grouping items in an array and getting the count
		List<String> fruits = Arrays.asList("apple", "apple", "banana","apple", "orange", "banana", "papaya");
		Map<String, Long> fruitCount = fruits.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("--------------------------------");
		System.out.println("Grouping Items and displaying their Count");
		System.out.println(fruitCount);
		
		//Above same eg Grouping items in an array and getting the count in sorted manner.
		Map<String, Long> fruitMapCount = fruits.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		Map<String, Long> fruitMapSortedCount = new LinkedHashMap<>();
		fruitMapCount.entrySet().stream()
		.sorted(Map.Entry.<String,Long> comparingByValue().reversed()).forEachOrdered(e -> fruitMapSortedCount.put(e.getKey(), e.getValue()));
		System.out.println("--------------------------------");
		System.out.println("Grouping in sorted Manner");
		System.out.println(fruitMapSortedCount);
	}

}
