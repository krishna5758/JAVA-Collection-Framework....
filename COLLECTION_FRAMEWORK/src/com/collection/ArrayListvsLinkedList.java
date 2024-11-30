package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Q) How does ArrayList differ from LinkedList? When would you use one over the other?

// EXPLANATION >> : ArrayList is backed by a dynamic array, providing fast random access
//and slower insertions/removals in the middle. LinkedList is backed by a doubly
//linkedlist, providing faster insertions/removals but slower access time.


public class ArrayListvsLinkedList {

	public static void main(String[] args) {
		
		List<String>list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		
		List<String>linkedlist =   new LinkedList<>();
		linkedlist.add("Coffiee");
		linkedlist.add("Milk shake");
		linkedlist.add("Banana Shake");
		
		// Random Access
		
		System.out.println("Array List get(1)"+list.get(1)); // Fast Access
		
		// Insertion / Removal
		
		linkedlist.add(0,"Cherry");
		linkedlist.remove("Coffiee");
		
		System.out.println("Linked List after modification :"+linkedlist);
	}
}
