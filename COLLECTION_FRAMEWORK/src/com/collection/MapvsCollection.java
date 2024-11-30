package com.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* Q7) . What is a Map in Java? How does it differ from a Collection?
 * 
 * Explanation > A MAP is an object that maps keys to values, where each key is unique
 *               it differs from collection as collection stores individual elements
 *               while map stores key-value pairs */

public class MapvsCollection {

	public static void main(String[] args) {
		
		Map<String, Integer>map = new HashMap<>();
		map.put("Apple", 1);
		map.put("Banana", 2);
		
		Collection<Integer>collection = map.values();
		
		System.out.println("Map :"+map);
		System.out.println("Collection :"+collection);
	}
}
