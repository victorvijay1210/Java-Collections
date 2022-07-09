package Map;

import java.util.Hashtable;

public class Hashtableimplementation {

	public static void main(String[] args) {
		
		
		//hashtable does not allow null key and null value and initial capacity of hashtable is 11
		
				
Hashtable<String, Integer> ht = new Hashtable<String, Integer>();


ht.put("Vijay", 100);
ht.put("Manish", 60);
ht.put("Karthick", 77);

System.out.println(ht.get("Karthick"));
System.out.println(ht.get("Vijay"));

	}

}
