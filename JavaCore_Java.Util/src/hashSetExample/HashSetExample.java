package hashSetExample;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
//		Initialization of an empty HashSet
		HashSet<String> hashSet = new HashSet<String>();
		
//		Adding elements to the Hashset
		hashSet.add("A");
		hashSet.add("D");
		hashSet.add("F");
		hashSet.add("E");
		hashSet.add("C");
		hashSet.add(null);
		
		System.out.println(hashSet);

		System.out.println("Number of elements in the HashSet: " + hashSet.size());
		
		Iterator<String> inIteratorSet = hashSet.iterator();
		while (inIteratorSet.hasNext()) {
			System.out.println("Result: " + inIteratorSet.next());
		}

//		adding duplicate element
		hashSet.add("A");
		hashSet.add("F");
		System.out.println("After add A and F Hashset still not change: " + hashSet);
		
//		Removing an element
		hashSet.remove("E");
		System.out.println(hashSet);
	}

}
