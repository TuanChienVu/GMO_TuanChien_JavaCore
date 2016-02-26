package vecTorExample;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
//		Create a Vector and populate it with elements
		Vector<Object> vector = new Vector<Object>();
		vector.addElement(new String("Task 1"));
		vector.addElement(new String("Task 2"));
		vector.addElement(new String("Task 3"));
		vector.addElement("Task 4");
		vector.add("Task 5");
		
		System.out.println(vector);
		System.out.println("Capacity: " + vector.capacity());
		System.out.println("Vector Size: " + vector.size());
		
//		Clone another vector
		System.out.println(vector.clone());
		
//		Replacing an element at the specified index of Vector
		vector.set(1, "Finish");
		System.out.println(vector);
		
//		checking if an element is included to the list
		boolean check = vector.contains("Task 3");
		System.out.println("Vector contains Task 3: " + check);
		
		Enumeration<Object> enumeration = vector.elements();
		
		System.out.println("-----Vector Elements-----");
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		
//		Remove the specific object from the Vector
		vector.remove("Task 4");
		System.out.println("After removing: " + vector);
		
		Object object = vector.elementAt(3);
		System.out.println("Position 3 is: " + object);
		
	}

}
