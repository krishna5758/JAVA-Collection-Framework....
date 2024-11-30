package com.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/* Q9) What are the main differences between HashMap and Hash table ?
 * 
 * Explanation > *) SYNCHRONIZATION > HashMap is not synchronized, while HashTable 
 *                                    is synchronized
 *                                    
 *               *) NULL KEYS/VALUES > HashMap allows one null key and multiple null
 *                                     values. HasTable does not allow null key and
 *                                     null values.                    
 *                                     
 *               *) PERFORMANCE > HashMap generally performs better due to the lack
 *                                of synchronization.*/

                 
public class HashMapvsHashTable {

	public static void main(String[] args) {
		
		Map<String, Integer>hashmap = new HashMap<>();
		
		hashmap.put("Apple", 1);
		hashmap.put(null, 2); // ALLOWED
		
		Map<String, Integer>hashtable = new Hashtable<>();
		hashtable.put("key1", 1);
		//hashtable.put(null, 2); // THROWS NULL POINTER EXCEPTION
		
		System.out.println("Hashmap :"+hashmap);
		
		System.out.println("Hashtable :"+hashtable);
	}
}
