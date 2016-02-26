package treeSetExample;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
		treeSet.add(23);
		treeSet.add(12);
		treeSet.add(43);
		treeSet.add(34);
		treeSet.add(54);
		treeSet.add(42);
		treeSet.add(22);
		
		Iterator<Integer> iteratorSet = treeSet.iterator();
		System.out.printf("TreeSet data: ");
		
		while (iteratorSet.hasNext()) {
			System.out.printf(iteratorSet.next() + " ");
		}
		
//		Check empty or not
		if (treeSet.isEmpty()) {
			System.out.println("TreeSet is empty");
		} else {
			System.out.println("\nTreeSet size is: " + treeSet.size());
		}
		
//		Getting first element from TreeSet
		System.out.println("First Element: " + treeSet.first());
		
//		Getting last element from TreeSet
		System.out.println("Last Element: " + treeSet.last());
		
//		Remove element by value
		if (treeSet.remove(42)) { 
			System.out.println("Data is removed from tree set");
		} else {
			System.out.println("Data doesn't exist!");
		}
		System.out.print("Now the tree set contain: ");
		iteratorSet = treeSet.iterator();
		
		while (iteratorSet.hasNext()) {
			System.out.print(iteratorSet.next() + " ");
		}
		
		System.out.println("\nNow the size of tree set: " + treeSet.size());

//		Remove all
		treeSet.clear();
		if (treeSet.isEmpty()) {
			System.out.print("Tree Set is empty.");
		} else {
			System.out.println("Tree Set size: " + treeSet.size());
		}
	}

}
