package hashMapExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
//		create a hashmap
		HashMap<String, Integer> laptop = new HashMap<>();
//		hashMap with multiple values
		HashMap<String, ArrayList<String>> lapColor = new HashMap<String, ArrayList<String>>();
		
//		Add some laptops, put elements to the hashMap
		laptop.put("Lenovo", 5);
		laptop.put("Dell", 7);
		laptop.put("Vaio", 3);
		laptop.put("Asus", 9);
		
//		take size of hashmap
		System.out.println("Total Lap: " + laptop.size());

//		check if hashmap contains values 5
		System.out.println("Hashmap contains 5: " + laptop.containsValue(5));
		
//		check if hashmap contains key Acer
		System.out.println("Hasmap contains Acer: " + laptop.containsKey("Acer"));
		
//		Using the keySet method, take a value of a specific key
		for (String key: laptop.keySet()) {
			System.out.println(key + " have: " + laptop.get(key));
		}
		
		String searchKey = "Lenovo";
		if (laptop.containsKey(searchKey)) {
			System.out.println("We found " + laptop.get(searchKey) + " " + searchKey);
		}
		
		
//		Create an arrayList lapColor
		ArrayList<String> firstList = new ArrayList<String>();
		firstList.add("Blue");
		firstList.add("Black");
		firstList.add("Brown");
		
//		Create second arraylist lapColor
		ArrayList<String> secondList = new ArrayList<String>();
		secondList.add("Pink");
		secondList.add("Purple");
		
//		Put values into hashmap
		lapColor.put("B Color", firstList);
		lapColor.put("P Color", secondList);
		 
		Set<Entry<String, ArrayList<String>>> setMap = lapColor.entrySet();
		
		Iterator<Entry<String, ArrayList<String>>> iteratorMap = setMap.iterator();
		
		System.out.println("Hasmap with multiValues: ");
		
		while (iteratorMap.hasNext()) {
			Map.Entry<String, ArrayList<String>> entry = 
					(Map.Entry<String, ArrayList<String>>) iteratorMap.next();
			String key = entry.getKey();
			ArrayList<String> values = entry.getValue();
			System.out.println("Key = '" + key + "' has values: " + values);
		}
	}

}
