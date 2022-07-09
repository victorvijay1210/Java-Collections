package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Hashmapcomparison {

	public static void main(String[] args) {

		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		
	HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		
	map2.put(1, "A");
	map2.put(3, "B");
	map2.put(2, "C");
	
	HashMap<Integer, String> map3 = new HashMap<Integer, String>();
	
	map3.put(1, "A");
	map3.put(2, "B");
	map3.put(3, "C");
	map3.put(4, "D");
	
	//equals method used to compare keys 
		System.out.println(map1.equals(map2));
		
   //By using hashset we can find extra keys present by combining two hashmap
	//passing map1 keys as contructor	
		HashSet<Integer> combinekeys = new HashSet<Integer>(map1.keySet());
		
		combinekeys.addAll(map3.keySet());
	   combinekeys.removeAll(map1.keySet());
	   System.out.println(combinekeys);
	   
	   //using arraylist we can compare values (dupliactes are allowed in arraylist and we comapare duplicates)
	   System.out.println(new ArrayList<>(map1.values()).equals(new ArrayList<>(map2.values())));
	   
	   //using hashset we can compare values( duplicates are not allowed and we can get unique elements)
	   System.out.println(new HashSet<>(map1.values()).equals(new HashSet<>(map3.values())));
	   
	}

	
	
}
