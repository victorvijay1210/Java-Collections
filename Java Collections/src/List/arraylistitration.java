package List;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylistitration {

	public static void main(String[] args) {
		
		ArrayList<String> students = new ArrayList<>();
		students.add("Vijay");
		students.add("Rahul");
		students.add("manish");
		
		System.out.println(students.size());
		System.out.println(students.get(2));

		
		//iterating arraylist with for loop
		for(int i=0; i<students.size();i++ ) {
			System.out.println(students.get(i));
		}
		
		//iterating arraylist with for eachloop
		for(String S: students) {
			System.out.println(S);
		}
		
		//iterating arraylist with whileloop
	Iterator<String>IT=	students.iterator();		
	while(IT.hasNext()) {
		System.out.println(IT.next());
	}
	
	//iterating arraylist with stream lambda for each expression
	students.stream().forEach(stu->System.out.println(stu));
	}

}
