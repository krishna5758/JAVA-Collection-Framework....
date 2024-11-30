package com.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// Q4) Explain the concept of a Set in Java and its implementations.
// A set is a collection that does not allow DUPLICATE elements. It is 
// implemented by HashSet, LinkedHashSet, and TreeSet.

// * HashSet : Uses a Hash table and does not guarantee any order.
// * LinkedHashSet : Maintains insertion order using Linked List.
// * TreeSet : Implements navigable set and sort elements according to their natural 
//             ordering or comparator.


public class SetExample {

	public static void main(String[] args) {
		
		Set<String>hashset = new HashSet<>(Arrays.asList("One", "Two", "Three"));
		
		Set<String>linkedhashset = new LinkedHashSet<>(Arrays.asList("B", "A", "C"));
		
		Set<String>treeset = new  TreeSet<>(Arrays.asList("Y", "X", "Z"));
		
		System.out.println("Hash Set :"+hashset);
		System.out.println("Linked Hash Set :"+linkedhashset);
		System.out.println("Tree Set :"+ treeset );
	}
}
