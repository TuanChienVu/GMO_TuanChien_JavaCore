package treeMapExample;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
//		 Declare and instantiate TreeMap
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		
//		Adding elements to TreeMap
		treeMap.put(11, "Tuan Chien");
		treeMap.put(14, "Kim Tam");
		treeMap.put(28, "Hoang Dong");
		treeMap.put(19, "Duc Tran");
		treeMap.put(45, "Nhu Phung");
		
//		Using Iterator
		Set<Entry<Integer,String>> setTreeMap = treeMap.entrySet();
		
		Iterator<Entry<Integer, String>> iterator = setTreeMap.iterator();
		
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entryMap = (Map.Entry<Integer, String>)iterator.next();
			
			 System.out.print("Key is: "+ entryMap.getKey() + " & Value is: ");
	         System.out.println(entryMap.getValue());
		}
		
//		Get keys of TreeMap
		Set<Integer> keySet = treeMap.keySet();
		System.out.println("TreeMap keys: " + keySet);
		
//		Get Size of TreeMap
		System.out.println("Size of TreeMap : " + treeMap.size());
		
//		Removing a element
		System.out.println(treeMap);
		treeMap.remove(28);
		System.out.println(treeMap);

	}

}
