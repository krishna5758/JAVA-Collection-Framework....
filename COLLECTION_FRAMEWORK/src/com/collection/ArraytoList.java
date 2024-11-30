package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Q11) . How do you convert an array to a List in Java?
 * 
 * Explanation > You can use Arrays.asList() to convert an array to a List. This method
 *               returns a fixed-size list backed by the specified array.*/

public class ArraytoList {

	public static void main(String[] args) {
		
		String[]Array = {"Apple", "Banana", "Mango"};
		
		List<String>list = new ArrayList<>(Arrays.asList(Array));
		
		System.out.println("List :"+list);
	}
}
