package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/* Q10) What is the difference between ArrayList and Vector
 * 
 * Explanation > SYNCHRONIZATION > Array list is not synchronized, while vector is
 *                                 synchronized.
 *                                 
 *               GROWTH POLICY   > Array list grows dynamically, while vector doubles
 *                                 its size when more space is needed.
 *                               
 *               PERFORMANCE     > Array list performs better due to the lack of 
 *                                 synchronization                                  */

public class ArrayListvsVector {

	public static void main(String[] args) {
		
		List<String>list = new ArrayList<>();
		list.add("Apple");
		
		List<String>vector = new Vector<>();
		vector.add(null);
		
		System.out.println("Array list :"+list);
		
		System.out.println("Vector :"+vector);
	}
}
