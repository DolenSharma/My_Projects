package co.java.preparation;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		float f;
		System.out.println("Enter a number: ");
		n= sc.nextInt();
		System.out.println("You entered a number: "+n);
		
		
		System.out.println("Enter a float number: ");
		f= sc.nextFloat();
		System.out.println("Floating value: "+f);
		
		System.out.println("Enter your name: ");
		String name = sc.next();
		System.out.println("You entered a name: "+name);

		sc.close();
	}

}
