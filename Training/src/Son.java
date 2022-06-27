
public class Son extends Father {
	String name;
	Son(){
		name = "Dolen";
		
	}
	void printDetails() {
		System.out.println("Hello, my name is "+this.name + " " + this.familyName + " and  I am from " + " " +this.houseAddress +".");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s1 = new Son();
		s1.printDetails();

	}

}
