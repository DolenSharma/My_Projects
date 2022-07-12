import java.util.Scanner;

class Interest{
	float p,r,si;
	int t;
	
	void takeInput() {
		System.out.println("Enter principal amount");
		Scanner scan = new Scanner(System.in);
		p = scan.nextFloat();
		System.out.println("Enter rate");
		r = scan.nextFloat();
		System.out.println("Enter time");
		t = scan.nextInt();
		
		scan.close();
		
		
		give_interest(p,r,t);
		
	}

	  void give_interest(float p, float r, int t) {
		si = ((p*t*r)/100);
		System.out.println("Simple Interest:" + si);
		
	}
	
	
	
}

public class SimpleInterestOops {

	public static void main(String[] args) {
		Interest interest1 = new Interest();
		interest1.takeInput();
		

	}

}
