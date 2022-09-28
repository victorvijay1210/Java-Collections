package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicateElementsfromarraylist {

	public static void main(String[] args) {
		
		//By using Linkedhashset array list
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,4,3,2));
		
	 LinkedHashSet<Integer> linkedhasset = new LinkedHashSet<Integer>(numbers);
	 
	 ArrayList<Integer> withoutduplicate = new ArrayList<Integer>(linkedhasset);
	 
//	 System.out.println(linkedhasset.retainAll(withoutduplicate));
	 
	 System.out.println(withoutduplicate);

	 
	 
	 
	 //By using stream
	 ArrayList<Integer> marks = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,4,3,2));
	 
List<Integer> it =	 marks.stream().distinct().collect(Collectors.toList());

System.out.println(it);
	}
	
	

}
