package Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SynchronizedhashmapVSconcurrenthashmap {

	public static void main(String[] args) {

		
		//synchronized map
		Map<String,String> map1 = new HashMap<String,String>();
		
		map1.put("Vijay","QA");
		map1.put("Ajay", "Technician");
		map1.put("Rahul", "Developer");
		
		Map<String,String> syncmap= Collections.synchronizedMap(map1);
		
		System.out.println(syncmap);

	
	
//		concurrenthashmap
	ConcurrentHashMap<String, String> map2 = new  ConcurrentHashMap<String,String>();
	map2.put("A", "100");
	map2.put("B", "200");
	map2.put("C", "300");
	
	System.out.println(map2);
	
	System.out.println(map2.get("C"));
	
	
	
	}

	

	
	
}

