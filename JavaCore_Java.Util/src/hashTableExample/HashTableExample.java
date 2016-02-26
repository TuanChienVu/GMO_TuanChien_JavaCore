package hashTableExample;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableExample {

	public static void main(String[] args) {
//		Declare and instantiate the Hashtable.
		Hashtable<String, Integer> product = new Hashtable<>();
		
		String productName;
//		Insert some elements for hashtable
		product.put("Softdrink", 30);
		product.put("Beer", 40);
		product.put("Candy", 25);
		product.put("Cake", 33);
		
//		Show all balances in hashtable.
//		First, get a set view of the keys.
		Set<String> keys = product.keySet();
		
//		Get an Iterator.
		Iterator<String> iterator = keys.iterator();
		
//		Iterate.
		while (iterator.hasNext()) {
			productName = iterator.next();
			System.out.printf("%s: %d\n", productName, product.get(productName));
		}
		
//		Get size of this hashtable
		System.out.println("Hashtable Size is: " + product.size());
		
//		Check existing by boolean containsKey(Object key)
		boolean existKey = product.containsKey("Softdrink");
		boolean existValue = product.containsValue("100");
		System.out.println("Softdrink exists in Hashtable? : " + existKey);
		System.out.println("Candy has 100 boxes true or false: " + existValue);
		
//		Insert more 20 cans into Beer
		int beerCan = product.get("Beer");
		product.put("Beer", beerCan + 20);
		
		System.out.println("Total of Beer Can is: " + product.get("Beer") + " cans");
		
		System.out.println("Before removing Cake from Hashtable: " + product.clone());
//		Remove a key value pair from Hashtable.
		product.remove("Cake");
		System.out.println("After removing Cake Hashtable contains: " + product);
	}

}
