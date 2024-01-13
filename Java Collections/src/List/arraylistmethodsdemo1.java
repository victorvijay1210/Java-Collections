package List;

import java.util.ArrayList;

public class arraylistmethodsdemo1 {

	public static void main(String[] args) {

		ArrayList<String> students = new ArrayList<>();
		students.add("Vijay");
		students.add("Rahul");
		students.add("manish");
		
		ArrayList<String> subject = new ArrayList<String>();
		subject.add("Maths");
		subject.add("English");
		subject.add("Science");
		
		//combines two arraylist
		students.addAll(subject);
        System.out.println(students);
      
//        //combines two array based on index
//        students.addAll(1, subject);
//        System.out.println(students);
//        
//        //contains method check the value is present or not and will return boolean value
//      System.out.println(students.contains("vimal"));  
//      
//      //index of method checks the index value
//      System.out.println( students.indexOf("manish")>9);
      
      //checks the last index value of array list
  System.out.println(students.lastIndexOf("manish"));    
      
      
	}

}
