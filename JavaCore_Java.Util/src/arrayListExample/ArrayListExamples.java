package arrayListExample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExamples {

	public static void main(String[] args) {
//		Creating an empty array list
		ArrayList<String> list = new ArrayList<String>();
		
//		Adding items to array list
		list.add("Student A");
		list.add("Student B");
		list.add("Student C");
		list.add(3, "Student D");
		list.add("Student E");
		
//		Show the contents of the array list
		System.out.println("The arraylist contains: " + list);
		
//		checking index of an item
		int position = list.indexOf("Student D");
		System.out.println("The index of Student D is: " + position);
		
//		checking list isEmpty
		boolean check = list.isEmpty();
		System.out.println("Checking if the arraylist is empty: " + check);
		
//		getting the size of the list
		int size = list.size();
		System.out.println("The size of the list is: " + size);
		
//		checking if an element is included to the list
		boolean element = list.contains("Student F");
		System.out.println("ArrayList contains Student F: " + element);
		
//		getting the element in a specific position
		String student = list.get(0);
		System.out.println("The student is at the index 0 is: " + student);
		
//		loop using index and size list
		System.out.println("Loop using index and size list");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Index: " + i + " - Student: " + list.get(i));
		}
		
//		using foreach loop
		System.out.println("Using foreach loop");
		for (String str : list) {
			System.out.println("Student is: " + str);
		}
		
//		using iterator
		System.out.println("Using iterator");
		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
			System.out.println("Student is: " + iterator.next());
		}
		
//		replacing an element
		list.set(2, "New Student");
		System.out.println("The arraylist after replacement is: " + list);
		
//		removing students
		list.remove(0);
		list.remove("Student D");
		System.out.println("Contents of arraylist: " + list);
		
	}
}
