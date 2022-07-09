package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;



	//To compare employee salary firt create class and initialize employee objects
	
	class Employee{
		
		String Employeename;
		int Employeesalary;
		
		//create constructor to initialize object
		public Employee(String Employeename, int Employeesalary ) {
			
			this.Employeename=Employeename;
			this.Employeesalary=Employeesalary;
		}

		
		//generate tostring method
       // modify the objects in this method
		@Override
		public String toString() {
			return "Employee [Employeename=" + Employeename + ", Employeesalary=" + Employeesalary + "]";
		}
		
	
		
		
		
	}
	
	
	
	//Create comparitor interface to implement by creating class as employee comparison
	// pass the employee in the constructor
	// change return type from 0 to employee salary
	class employeecomparison implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return o1.Employeesalary - o2.Employeesalary;
		}
		
	}
	
	public class queuecomparator {
	
	public static void main(String[] args) {
		
		//create object for employee comparison
		 
		employeecomparison compare = new employeecomparison();

		PriorityQueue<Employee> pr = new PriorityQueue<>(10,compare);
		
		pr.add(new Employee("A", 1000));
		pr.add(new  Employee("B", 2000));
		pr.add(new Employee("C", 2500));
		
	System.out.println(pr.poll());
	System.out.println(pr);
		
		
		
		
		
		
		
		
		
	}

}
