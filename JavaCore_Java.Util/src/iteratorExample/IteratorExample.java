package iteratorExample;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorExample {

	public static void main(String[] args) {
		
//		Create a LinkedList then adding elements
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Vu");
		linkedList.add("Tuan");
		linkedList.add("Chien");
		
//		The Iterator object is obtained using iterator() method
		Iterator<String> iterator = linkedList.iterator();
		System.out.println("LinkedList Elements: ");
		
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		
	}

}
