package Map;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapimplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String > tree1 = new TreeMap<Integer,String>();
		
		
		tree1.put(3000, "Mukesh");
		tree1.put(1000, "Vijay");
		tree1.put(2000, "Ajay");
		tree1.put(900, "Ramesh");
		
		
		
		//treemap follows sorting order
		tree1.forEach((k,v)-> System.out.println("Key==="+k +"Value=="+v));

		
		
		//usecase to use treemap headmap takes less than mentioned value
		Set<Integer> map1 = tree1.headMap(3000).keySet();
		System.out.println(map1);
		
		
		
	}

}
