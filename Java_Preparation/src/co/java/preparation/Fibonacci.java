package co.java.preparation;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find the fibonacci series is: ");
	 	int fnum = sc.nextInt();
	 	displayFibonacciSeries(fnum);
		
		sc.close();

	}
	static void displayFibonacciSeries(int n) {
		int x = 1, y = 0, z= 0, count = 1;
		while(count<=n) {
			System.out.print(z+" ");
			z = x + y;
			x = y;
			y = z;
			count++;
			
		}
	}

}
