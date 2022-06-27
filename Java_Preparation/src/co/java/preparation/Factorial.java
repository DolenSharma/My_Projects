 package co.java.preparation;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	 	 System.out.println("Enter first number to find factorial");
	 	 int num = sc.nextInt(); 
	 	 Factorial fobj = new Factorial();
	 	 int fact = fobj.factorial(num);
	 	 
	 	System.out.println("Factorial of "+num+" = "+fact+".");
	 	sc.close();
	}
	int factorial(int n){
	
		int fact = 1;
		for(int seq = 2; seq<=n; seq++) {
			fact *= seq; 
		}
		return fact;
	}

}
