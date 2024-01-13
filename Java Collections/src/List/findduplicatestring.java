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
	  
	     //another way
	  // Creating an ArrayList of integers with some duplicate elements
	        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3));

	        // Creating two HashSet objects to keep track of unique and duplicate elements
	        Set<Integer> uniqueNumbers = new HashSet<>();
	        Set<Integer> duplicateNumbers = new HashSet<>();

	        
	        // Iterating through the elements of the ArrayList
	        for (Integer number : numbers1) {
	        	
	        	
	            // Trying to add the current number to the unique set
	            if (!uniqueNumbers.add(number)) {
	                // If the add operation fails (returns false), it means the number is already in the set
	                // So, it's a duplicate, and we add it to the duplicate set
	                duplicateNumbers.add(number);
	            }
	        }

	        // Printing the duplicate elements
	        System.out.println("Duplicate elements: " + duplicateNumbers);
	     
}
	
}