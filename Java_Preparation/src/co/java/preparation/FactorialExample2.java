package co.java.preparation;

import java.util.Scanner;

public class FactorialExample2 {

	public static void main(String[] args) {
		int n, fact = 1;
		System.out.println("Enter any number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		for(int i = 1;i<=n;i++) {
			fact = fact *i;
		}
		System.out.println("Factorial of  "+n+" : "+fact);

	}

}
