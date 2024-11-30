package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {
		
		List<String>list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		
		
		Set<String>set = new HashSet<>();
		set.add("Orange");
		set.add("Apple");
		
		
		Map<String, Integer>map = new HashMap<>();
		map.put("key1", 1);
		map.put("key2", 2);
		
		System.out.println("List :"+list);
		System.out.println("Set :"+set);
		System.out.println("Map :"+map);
	}
}
