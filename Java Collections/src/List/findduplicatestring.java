package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class findduplicatestring {
	
	public static void main(String[] args) {
	
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,1,2,3));
		

		 System.out.println(numbers);
		 
	     Set<Integer> duplicateCompanies = numbers
	                .stream()
	                .filter(company -> Collections.frequency(numbers, company) > 1)
	                .collect(Collectors.toSet());
	     
	     System.out.println(duplicateCompanies);
	  
}
	
}