package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionVsCollections {
	
	public static void main(String[] args) {
		
		List<String>list = new ArrayList<>(Arrays.asList("Banana", "Apple", "Orange"));
		
		// Collections utility class
		// there are two methods in collection 
		// 1) sort
		// 2) reverse
		Collections.sort(list);
		System.out.println("Sorted List :"+list);
		Collections.reverse(list);
		System.out.println("Reverseed List : "+list);
		
		// collection interface
		
		Collection<String>collection = new ArrayList<>();
		collection.add("Apple");
		collection.add("Banana");
		collection.add("Orange");
		System.out.println("Collection Size :"+collection.size());
	}

}
