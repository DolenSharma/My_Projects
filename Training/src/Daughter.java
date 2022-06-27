
public class Daughter extends Father {
	String name;
	Daughter(){
		name = "Dolina";
		
	}
	void printDetails() {
		System.out.println("Hello, my name is "+this.name + " " + this.familyName + " and  I am from " + " " +this.houseAddress +".");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s1 = new Son();
		s1.printDetails();
		Daughter d1 = new Daughter();
		d1.printDetails();
		}
	

	

}
