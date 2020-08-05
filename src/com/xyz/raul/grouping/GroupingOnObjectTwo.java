package com.xyz.raul.grouping;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.xyz.raul.pojo.Item;
import com.xyz.raul.util.Java8Util;

public class GroupingOnObjectTwo {
	
	public static Supplier<List<Item>> populate = () -> Java8Util.getItems();
	
	public static BiConsumer<BigDecimal,List<Item>> loopMap = (k,v)->{
		System.out.println("Price is "+k);
		System.out.println("Items are ");
		v.forEach(System.out::println);
		System.out.println("----------");
	};
	public static BiConsumer<BigDecimal,Set<String>> loopMap1 = (k,v)->{
		System.out.println("Price is "+k);
		System.out.println("Items are ");
		v.forEach(System.out::println);
		System.out.println("----------");
	};
	
	public static void main(String[] args) {
		List<Item> itemList = populate.get();
		itemList.stream().forEach(System.out::println);
		System.out.println("@@@@@@@@@@");
		System.out.println("");
		System.out.println("");
		//Group by price
		Map<BigDecimal, List<Item>> groupItemByPrice = itemList.stream().collect(Collectors.groupingBy(Item::getPrice));
		groupItemByPrice.forEach(loopMap);
		System.out.println("@@@@@@@@@@");
		System.out.println("");
		System.out.println("");
		//Group by price and return only name from the Item List
		Map<BigDecimal, Set<String>> groupItemNameByPrice = itemList.stream().collect(Collectors.groupingBy(Item::getPrice,Collectors.mapping(Item::getName, Collectors.toSet())));
		groupItemNameByPrice.forEach(loopMap1);	
		
		
		
	}

}
