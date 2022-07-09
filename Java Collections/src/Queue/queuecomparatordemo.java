package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;



//by creating class and implements create comparetor interface 
	
	class Comparestring implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
	//	return o1.length()-o2.length();
		return o2.length()-o1.length();
	}
		
	}
	
	
	public class queuecomparatordemo {
	
	public static void main(String[] args) {

		Comparestring com = new Comparestring();
		
		PriorityQueue<String> pr = new PriorityQueue<String>(10, com);
		
		pr.add("Vijay");
		pr.add("Victot Vijay");
		pr.add("Manish Dhapte");
		
		System.out.println(pr.poll());
			
		
	}

}
