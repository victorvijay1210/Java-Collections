package List;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlistmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//common methods of arraylist can be implemented here as well
		LinkedList<String> LL1 = new LinkedList<String>();
		
		LL1.add("Maths");
		LL1.add("Science");
		LL1.add("Social");
		
		System.out.println(LL1.size());
		System.out.println(LL1.get(2));
		
		LinkedList<String> LL2 = new LinkedList<String>();
		

		LL2.add("Physis");
		LL2.add("Chemistry");
		LL2.add("English");
		
		
		System.out.println("=========================================");
		LL1.addAll(LL2);
		System.out.println(LL1);
		System.out.println("=========================================");
		//index based adding
		LL1.add(1, "English");
		System.out.println(LL1);
		System.out.println("=========================================");
		//iteration 
	Iterator<String> it1=	LL1.iterator();
	
	while(it1.hasNext()) {
		System.out.println(it1.next());
	}
		
	System.out.println("=========================================");	
//Reverse iteration
	Iterator<String> it2=LL1.descendingIterator();
	while(it2.hasNext()) {
		System.out.println(it2.next());
	}
	
	}

}
