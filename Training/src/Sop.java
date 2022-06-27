import java.util.Scanner;

public class Sop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter number to find SOP");
		int n = sc.nextInt();
		sc.close();
		System.out.println("The number you entered is: "+ n);
		int sum = 0;
		sop(n, sum);
		
		
	}

	private static void sop(int n, int sum) {
	    sum = 0;
		sum += n; 
		System.out.println("SOP: "+sum);
		
		
	}
}

	

