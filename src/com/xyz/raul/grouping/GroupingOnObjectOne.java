package com.xyz.raul.grouping;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.xyz.raul.pojo.Item;
import com.xyz.raul.util.Java8Util;

public class GroupingOnObjectOne {

	public static void main(String[] args) {
		
		//Displaying ItemList
		List<Item> itemList = Java8Util.getItems();
		System.out.println(itemList);
		
		//Grouping Item and getting their frequency or count
		Map<String, Long> itemCountMap = itemList.stream().collect(Collectors.groupingBy(Item::getName,Collectors.counting()));
		System.out.println(itemCountMap);
		
		//Grouping Item and getting the total quantity by adding them
		Map<String, Integer> totalQtyItem = itemList.stream()
			.collect(Collectors.groupingBy(Item::getName,Collectors.summingInt(Item::getQty)));
		System.out.println(totalQtyItem);
	}

}
