
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee("Tom", 25, "555-555-55", "Home", 25631.5, "IT");
        Manager manager = new Manager("Ron", 30, "555-617-55", "Earth", 69586.5, "IT");
        employee.printSalary();
        manager.printSalary();

	}

}
