package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Arraylistsynchronization {

	public static void main(String[] args) {


		
		//Collection.synchronized/Synchronization is the explicit method to return synchronized list
		
	List<String> sync=	Collections.synchronizedList(new ArrayList<String>());
	
	sync.add("java");
	sync.add("python");
	sync.add("JS");
	
	//to add remove values we don't need explicit synchronized 
	//to traverse and fetch the value we need to mention explicit synchronized
	
	synchronized (sync) {
		
	Iterator<String> synclist=	sync.iterator();
	
	while(synclist.hasNext()) {
		System.out.println(synclist.next());
	}
		
	
	
	
	//copyonright array list is the threadsafe varient 
	
	CopyOnWriteArrayList<String> cpy = new CopyOnWriteArrayList<String>();
	cpy.add("Vijay");
	cpy.add("ajay");
	cpy.add("manish");
	
	cpy.stream().forEach(prnt->System.out.println(prnt));
	
	}
	
	}

}
