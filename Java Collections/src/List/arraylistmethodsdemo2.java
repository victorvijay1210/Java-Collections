package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class arraylistmethodsdemo2 {

	public static void main(String[] args) {

		
		ArrayList<String> language = new ArrayList<String>(Arrays.asList("Java", "Phython", "C#" , "JS", "PHP", "HTML"));
		
		//remove method is used to remove the value
		language.remove(1);
		language.remove("PHP");
		System.out.println(language);
		
		
		ArrayList<Integer> marks = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		
		//remove by condition with lambda function
		marks.removeIf(MK -> MK%2 ==0);
		
		System.out.println(marks);
		
		
		//retain all will retain the value
		ArrayList<String> employees = new ArrayList<String>(Arrays.asList("Ajith","Victor","Kishore","Kumar","Ajith"));
		
		employees.retainAll(Collections.singleton("Ajith"));
		System.out.println(employees);
	}

}
