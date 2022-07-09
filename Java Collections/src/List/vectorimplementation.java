package List;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class vectorimplementation {

	public static void main(String[] args) {

		Vector<Integer> it= new Vector<Integer>();
		
		
		it.add(50);
		it.add(99);
		it.add(12);
		it.add(13);
		it.add(16);
		it.add(18);
		it.add(34);
		
		
		System.out.println(it);

		//same arraylist and linkedlist methods can be implemented in vector
		
		//remove method
		it.remove(1);
		System.out.println("============================");
		System.out.println(it);
		System.out.println("============================");
		System.out.println(it.get(4));
		
		Vector<Integer> itnew= new Vector<Integer>();
		itnew.add(100);
		itnew.add(200);
		itnew.add(300);
		itnew.add(400);
		itnew.add(500);
		
		it.addAll(itnew);
		System.out.println("============================");
		System.out.println(it);
		
		
		//vector iteration
		
		//forloop
		for(Integer e: it) {
			System.out.println(it);
			System.out.println("============================");

		}
	
		//whileloop
	Iterator<Integer> its=	it.iterator();
		
		while(its.hasNext()) {
			System.out.println(its.next());
			System.out.println("============================");

		}
		
		//using lambda streams
		it.stream().forEach(news ->System.out.println(news));
		System.out.println("============================");

		
		//sorting
		Collections.sort(it);
		System.out.println(it);
	}
	
	

}
