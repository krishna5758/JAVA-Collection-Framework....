package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* Q5) What is the difference between a List and a Set?

*Explanation > A LIST is an ordered collection that allow duplicate elements and 
*              maintains insertion order 
*              
*            > A SET is a collection that does not allow duplicate elements and 
*              does not guarantee any specific order (Except LinkedHashSet and TreeeSet)  
*/

public class ListvsSet {

	public static void main(String[] args) {
		
		List<String>list = new ArrayList<>(Arrays.asList("Mango", "Orange", "Banana"));
		
		Set<String>set = new HashSet<>(Arrays.asList("Krishna","Krishna", "Shruti", "Nandkumar","Shobha","Lilly"));
		
		System.out.println("List :"+list);
		
		System.out.println("Set :"+set);
	}
}
