package Set;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetimplementation {

	public static void main(String[] args) {
		// Hashset always collect unique values it won't allow duplicates
		//same arraylist/linkedlist methods can be used here as well
		
		HashSet<String> set1 = new HashSet<String>();
		
		set1.add("Alpha");
		set1.add("Beta");
		set1.add("gamma");
		set1.add("Alpha");
		set1.add("lambda");
		
		set1.remove("lambda");
		System.out.println(set1);
		

	HashSet<Integer> set2= new  HashSet<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
	HashSet<Integer> set3= new  HashSet<Integer>(Arrays.asList(1,2,3,4,5,12,14,8,15));
	
		
	//union
	HashSet<Integer> union = new HashSet<Integer>(set2);
	union.addAll(set3);
	System.out.println(union);
	
	
	//intersection
	HashSet<Integer> intersection = new HashSet<Integer>(union);
	intersection.retainAll(set3);
	System.out.println(intersection);
	
	//diff
	HashSet<Integer> diff = new HashSet<Integer>(union);
	diff.removeAll(set3);
	System.out.println(diff);
	
	}

}
