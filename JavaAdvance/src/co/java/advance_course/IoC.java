//Example of dependency Injection and Inversion Control
package co.java.advance_course;

public class IoC {

	public static void main(String[] args) {
		
		IoC container = new IoC();
		User user = container.new User();
		user.add("This is some data. ");
		

	}
	//Business layer logic
	public class User {
		
		MySqlDatabase database;
		
		public User() {
			database = new MySqlDatabase();
		}
		
		public void add(String data) {
			database.persist(data);
		}
		
		
	}
	//Database access layer
	public class MySqlDatabase{
		public void persist(String data) {
			System.out.println("MySql has been persisted");
		}
	}

}
