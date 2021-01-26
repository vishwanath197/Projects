package inheritance;
/*
 *  TA : transportAllowance = 15*basicSalary /100.
 *  Employee :  15*basicSalary /100.
 *  Manager : 25*basicSalary /100.
 *  Trainee 
 * 
 * 
 * 
 */
public class Employee {
	private long employeeID;
	private String employeeName;
	private String employeeAddress;
	private long employeePhone;
	private double basicSalary;
	private double specialAllowance = 250.80;
	private double HRA = 1000.50;
	
	
	public Employee() {}
	
	public Employee(long employeeID, String employeeName, String employeeAddress, long employeePhone) {
		this.employeeID = employeeID;
		this.employeeName =  employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
	}
	
	//	Setters
	public void setID(long ID) {
		this.employeeID = ID;
	}
	
	public void setName(String name) {
		this.employeeName = name;
	}
	
	public void setAddress(String address) {
		this.employeeAddress = address;
	}
	
	public void setPhone(long phone) {
		this.employeePhone = phone;
	}
	
	public void setSalary(double salary) {
		this.basicSalary = salary;
	}
	
	public long getID() {
		return this.employeeID;
	}
	
	public String getName() {
		return this.employeeName;
	}
	
	public String getAddress() {
		return this.employeeAddress;
	}
	
	public long getPhone() {
		return this.employeePhone;
	}
	
	public double getBasicSalary() {
		return this.basicSalary;
	}
	
	
	public double getCalculateSalary() {
		double salary = basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * HRA/100);
		return salary;
	}
	
	public double getTransportAllowance()
	{
		System.out.println("Employee");
		return 15*basicSalary /100;
	}
	
	public String toString() {
		String response = "";
		response += "Employee[ ID: " + employeeID + " Name: " +  employeeName + " Address: " + employeeAddress + " Phone: " + employeePhone + " Salary: " + getCalculateSalary();
		return response;
	}
	

}

package inheritance;

public class EmployeeInheritance {

	public static void main(String[] args) {
		EmployeeManager m1 = new EmployeeManager(2356l, "Joseph", "Hyderabad", 989898, 20000);
		System.out.println(m1.getCalculateSalary());
		System.out.println("TA: " + m1.getTransportAllowance());
System.out.println("_------------------------------------------");
		EmployeeTrainee t = new EmployeeTrainee(1524,"John","SEC",98741,87444);
		System.out.println(t.getCalculateSalary());
		System.out.println("TA : " + t.getTransportAllowance());
		
	}

}

package inheritance;

public class EmployeeManager extends Employee {
	public EmployeeManager() {}
	
	public EmployeeManager(long employeeID, String employeeName, String employeeAddress, long employeePhone, double salary) {
		super(employeeID,employeeName,employeeAddress,employeePhone);
		setSalary(salary);
	}
	
	public double getTransportAllowance() {
		System.out.println(super.getTransportAllowance());
		System.out.println("Manager");
		return  25*getBasicSalary() /100;
	}

}

package inheritance;

public class EmployeeTrainee extends Employee {

	public EmployeeTrainee() {}
	
	public EmployeeTrainee(long employeeID, String employeeName, String employeeAddress, long employeePhone, double salary) {
		setID(employeeID);
		setName(employeeName);
		setAddress(employeeAddress);
		setPhone(employeePhone);
		setSalary(salary);
	}
	
	
	
}

package inheritance;

public class ScentificCalculator extends BasicCalculator{
	
	ScentificCalculator(){
		
	}
	//								5				4
	public ScentificCalculator(int value1, int value2){
		//			5
		setValue1(value1);
		//			4
		setValue2(value2);
	}
	
	public double getSquareroot() {
		return Math.sqrt(getValue1());
	}
	
	public double calculatepower() {
			return Math.pow(getValue1(), getValue2());
	}
	
}

package inheritance;

public class BasicCalculator {
	
	private  int value1; // 5
	private int value2;	// 4
	
	
	public BasicCalculator() {}
	
	public BasicCalculator(int value1, int value2) {
		this.value1 = value1;
		this.value2 = value2;
	}
	
		
	public int getValue1() {
		return value1;
	}
//								5
	public void setValue1(int value1) {
		this.value1 = value1; // 5
	}

	public int getValue2() {
		return value2;
	}
	//							4
	public void setValue2(int value2) {
		this.value2 = value2; // 4
	}

	public int getAddition ()
	{
		return value1 + value2;
	}
	
	public int getMultiplication() {
		return value1 * value2;
	}

}

package inheritance;

public class Calculator {

	public static void main(String[] args) {
		BasicCalculator b = new BasicCalculator(10,42);
		
		System.out.println("Addition : " + b.getAddition());
		
		
		ScentificCalculator s = new ScentificCalculator();
		s.setValue1(12);
		s.setValue2(13);
		
		System.out.println("Addition : " + s.getAddition());
		System.out.println("Power : " + s.calculatepower());
		
		
		ScentificCalculator s1 = new ScentificCalculator(5,4);
		System.out.println("Square Root : " + s1.getSquareroot());
		

	}

}
