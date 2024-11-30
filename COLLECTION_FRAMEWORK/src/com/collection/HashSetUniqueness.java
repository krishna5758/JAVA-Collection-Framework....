
package com.collection;

import java.util.HashSet;
import java.util.Set;

/* Q6) How does HashSet ensure the uniqueness of elements?
 * 
 *  Explanation > : HashSet uses a hash table to store elements. Each element’s
 *                  hash code is computed and used to place the element in a bucket. 
 *                  When checking for uniqueness, HashSet checks if the hash code 
 *                  matches and if the element is equal to any existing element 
                    in that bucket.*/

public class HashSetUniqueness {

	public static void main(String[] args) {
		
		Set<Integer>hashset = new HashSet<>();
		hashset.add(1);
		hashset.add(1); // hash set do not allow duplicate element
		hashset.add(2);
		hashset.add(3);
		
		System.out.println("Hash Set :"+hashset);
	}
}
