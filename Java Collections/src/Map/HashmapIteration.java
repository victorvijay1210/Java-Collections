package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashmapIteration {

	public static void main(String[] args) {

		
		HashMap<String,String> map= new HashMap<String, String>();
		
		map.put("Vijay", "Softwar Development Engineer in Test");
		map.put("Rahul", "PLSQL Developer");
		map.put("Manish", "QA");
		map.put("Ajith", "System quality Engineer");
		
		
		//iteration via keyset
		
	Iterator<String> it1=	map.keySet().iterator();
	
	while(it1.hasNext()) {
		
	String key=	it1.next();
String value=	map.get(key);
	
	System.out.println(key+ "and" + value);
		
	}
	
	//iteration via entryset
	
Iterator<Entry<String,String>>it2=	map.entrySet().iterator();
		
	while(it2.hasNext()) {
		Entry<String, String> obj = it2.next();
		System.out.println(obj.getKey() + obj.getValue());
		
	}
	
	//iterating using lambda
	map.forEach((k,v) -> System.out.println("Key=="+k+"Value=="+v));
		
	}

	
	
	
	
	
}
