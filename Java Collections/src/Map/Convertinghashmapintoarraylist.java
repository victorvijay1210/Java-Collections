package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Convertinghashmapintoarraylist {

	public static void main(String[] args) {

 Map<String,Integer> map1 = new HashMap<String,Integer>();
 
 
 map1.put("Ajay", 100);
 map1.put("Vijay", 90);
 map1.put("Manish", 70);
 
Iterator<Entry<String,Integer>> it= map1.entrySet().iterator();
 
	
while(it.hasNext()) {
	Entry<String,Integer> entry=it.next();
	System.out.println("Key==" +entry.getKey() +"Value==" +entry.getValue());
}
	
	
	//iteration of keys in arraylist
  ArrayList<String>	List1 = new ArrayList<String>(map1.keySet());
  
  for(String S : List1) {
	  
	  System.out.println(S);
  }

  //iteration of values in arraylist
  ArrayList<Integer> List2 = new ArrayList<Integer>(map1.values());
  
  for(Integer I:List2) {
	  System.out.println(I);
  }
	
  
//iteration by lambda expression
map1.forEach((k,v) -> System.out.println("Key=="+k +"Value=="+v));
  
  
  
  
	}

	
	

	
	
	
}
