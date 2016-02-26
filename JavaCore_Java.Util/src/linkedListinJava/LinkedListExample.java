package linkedListinJava;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

	public static void main(String[] args) {
//		create a LinkedList
		LinkedList<String> list = new LinkedList<String>();
		
//		add elements to the linked list
		list.add("Tuesday");
		list.add("Wednesday");
		list.add("Thursday");
		list.add("Friday");
		
//		create a list iterator
		ListIterator<String> listIterator = list.listIterator();
		System.out.println("-----LinkedList-----");
		
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
//		add elements in the beginning and in the end of the list
		list.addFirst("Monday");
		list.addLast("Saturday");
		System.out.println("-----After adding-----");
		
		listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		System.out.println("Check if list contains the Friday: " + list.contains("Friday"));
		
		System.out.println("Position of Wednesday is: " + list.indexOf("Wednesday"));
		
		System.out.println("Get element in 6th position: " + list.get(5));
		
		int size = list.size();
		System.out.println("The size of list is: " + size);
		
		System.out.println("-----Reversing list-----");
		listIterator = list.listIterator(size);
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
//		remove element from list
		list.remove("Thursday");
		list.removeFirst();
		list.removeLast();
		System.out.println("-----LinkedList after removing-----");
		listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

	}

}
