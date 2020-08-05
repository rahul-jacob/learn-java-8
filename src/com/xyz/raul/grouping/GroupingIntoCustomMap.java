package com.xyz.raul.grouping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class GroupingIntoCustomMap {

	public static void main(String[] args) {
		//Grouping Into a Custom Map Implementation
		List<String> list = Arrays.asList("a", "bb", "cc", "ddd");
		
		TreeMap<Integer, List<String>> collect = list.stream().collect(Collectors.groupingBy(String::length,TreeMap::new, Collectors.toList()));
		collect.forEach((k,v)-> {
			System.out.println("Length is "+k);
			//System.out.println("Strings are");
			v.forEach(System.out::println);
		});
		
		//Providing a Custom Downstream Collection
		//If you need to store grouped elements in a custom collection, this can be achieved by using a 
		//toCollection()  collector.
		
		Map<Integer, TreeSet<String>> collect2 = list.stream().collect(Collectors.groupingBy(String::length,Collectors.toCollection(TreeSet::new)));
		collect2.forEach((k,v)->{
			System.out.println("Length is "+k);
			v.forEach(System.out::println);
		});
	}
}
//https://dzone.com/articles/the-ultimate-guide-to-the-java-stream-api-grouping                          
