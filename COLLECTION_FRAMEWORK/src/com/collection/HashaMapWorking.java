package com.collection;

import java.util.HashMap;
import java.util.Map;

/* Q8)  Explain the working of HashMap in Java. How does it store and retrieve data?
 * 
 * Explanation > Hash map uses hash table for storage, it computes a hash code for each 
 *               key and uses it to determine the bucket location. each bucket holds a 
 *               linked list of entries to handle a hash collisions. it provides constant
 *               time complexity for basic operation like add, remove, and contains.  */

public class HashaMapWorking {

	public static void main(String[] args) {
		
		Map<String, Integer>hashmap = new HashMap<>();
		hashmap.put("Apple", 1);
		hashmap.put("Banana", 2);
		
		System.out.println("Hashmap get(\"Apple\"):" +hashmap.get("Apple"));
		
		System.out.println("Hashmap : "+hashmap);
	}
}
