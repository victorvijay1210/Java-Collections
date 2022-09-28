package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Comparingtwoarraylist {

	public static void main(String[] args) {

		
		//sort then equals
		
		ArrayList<String> L1 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> L2 = new ArrayList<String>(Arrays.asList("A","B","C","E","D"));
		
		Collections.sort(L1);
		Collections.sort(L2);
		System.out.println(L1.equals(L2));
		
		// removesall method removes common values
		ArrayList<String> L3 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> L4 = new ArrayList<String>(Arrays.asList("A","B","C","D","G"));
		
	L3.removeAll(L4);
	System.out.println(L3);
	
	//retainall method retain back common values
	ArrayList<String> L5 = new ArrayList<String>(Arrays.asList("java","python","php","js","C#"));
	ArrayList<String> L6 = new ArrayList<String>(Arrays.asList("java","python","php","js","golang"));
	
	L5.retainAll(L6);
	System.out.println(L5);
	
	}

}
