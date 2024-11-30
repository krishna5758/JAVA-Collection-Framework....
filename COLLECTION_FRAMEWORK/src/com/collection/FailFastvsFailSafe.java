package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* Q12)  What are fail-fast and fail-safe iterators
 * 
 * Explanation > Fail-Fast > These iterators detects changes to the collection while
 *                           iteration and throws " ConcurrentModificationException " 
 *                           
 *               Fail-Safe > These iterators work on the clone of the collection
 *                           ( e.g, CopyOnWriteArrayList ) and do not throw exceptions
 *                           if the collection is modified.            */

                 

public class FailFastvsFailSafe {

	public static void main(String[] args) {
		
		List<String>list = new ArrayList<>(Arrays.asList("A", "B", "C"));
		
		         try {
			
		              for	(String s: list ) {
		    	             list.add("D");   // modifying the list during iteration
		                                      }
		} catch(ConcurrentModificationException e){
			
			System.out.println("Fail-Fast modification iteration detected");
		                                          }
		
		List<String> copyonwritelist = new CopyOnWriteArrayList<>(Arrays.asList("A","B","C"));
		
	                  for (String s: copyonwritelist) {
	 	                 copyonwritelist.add("D"); // safe modification
	 	   
	 	   System.out.println("CopyOnWriteArrayList :"+copyonwritelist);
	 	   
	                                                  }
	                                        }
                                  }


