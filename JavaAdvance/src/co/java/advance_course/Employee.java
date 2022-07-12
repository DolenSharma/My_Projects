package co.java.advance_course;

public class Employee {
	
	//Instance variales
	int empId;
	String empName;
	String city;
	
	//local variables and instance variables must be same name 
	Employee(int empId, String empName, String city){
		//refers current class instace variables
		this.empId = empId;
		this.empName = empName;
		this.city = city;
		
	}
	
	public String toString() {
		return empId +" "+ empName + " " + city+".";
	}

	public static void main(String[] args) {
		Employee emp = new Employee(100,"Ram", "Pokhara");
		Employee emp1 = new Employee(101, "Hari", "Kathmandu");
		System.out.println(emp);
		System.out.println(emp1);
		
		

	}

}
