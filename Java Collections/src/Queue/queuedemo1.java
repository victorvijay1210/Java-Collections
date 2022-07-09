package Queue;

import java.util.PriorityQueue;

public class queuedemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		PriorityQueue<String> pr = new PriorityQueue<String>();
		
		pr.add("100");
		pr.add("10");
		pr.add("6000");
		pr.add("500");
		
		
		
		//poll method is used to remove least value from the queue
		
		System.out.println(pr.size());
		System.out.println(pr.poll());
		System.out.println(pr);
	}

}
