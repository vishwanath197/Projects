package encapsulation.Employee;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	/*Constructors
	 * - special type of method
	 * - NO returntype
	 * - Public Access Modifier
	 * - use : assign values for fields
	 * - types : With Arguments , without arguments
	 */ 
	// Constructor Overloading : Multiple Constructors with same name in same class 
	// Method Overloading : Multiple Methods with same name in same class
	
	
	// Default Constructor	: 1
	public Employee() {}
	
	// parameterized Constructor  : 2
	public Employee(int id, String firstName, String lastName, int salary) {
			this.id= id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.salary = salary;
	}
	
	// 3
	public Employee(int id , int salary) {
		this.id = id;
		this.salary = salary;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return salary ;
	}
	
	public String getName() {
		return firstName + " " + lastName; 
	}
	
	
	public int getAnnualSalary() {
		return salary * 12;
	}
	
	public int raisedSalary(int percent) {
		int newSalary= salary * (100 + percent) / 100;
		salary = newSalary;
		return salary;
	}
	
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", Salary= " + salary + "]";
	}
}

package encapsulation.Employee;

import java.util.Scanner;

public class EmployeeInfo {
	public static void main(String[] args) {
		Employee e1 = new Employee(1005,89000);
//		Employee e2 = new Employee("Arjun","Reddy");
		
		
		e1.setFirstName("Rakesh");
		e1.setLastName("Kumar");
		
		
		
		
	/*	e1.setId(101);
		e1.setFirstName("Rohit ");
		e1.setLastName("Kumar");
		e1.setSalary(50000);
		
		System.out.println(e1 + " " + " AnnualSalary= " + e1.getAnnualSalary() + " , raisedSalary=" + e1.raisedSalary(10));
		System.out.println(e1.getId() + " " + e1.getAnnualSalary());
		System.out.println(e1.getName() + " " + e1.getAnnualSalary() + " " + e1.raisedSalary(10));
		
		Scanner sc = new Scanner(System.in);
		e2.setId(sc.nextInt());
		e2.setSalary(sc.nextInt());
		e2.setFirstName(sc.next());
		e2.setLastName(sc.next());
		
		System.out.println(e2);
		
		*/
		
	}

}
