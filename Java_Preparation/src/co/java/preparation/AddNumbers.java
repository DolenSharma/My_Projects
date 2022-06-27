package co.java.preparation;

import java.util.Scanner;

public class AddNumbers {

	public static void main(String[] args) {
		int i, num, sum = 0; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number to find sop");
		num = sc.nextInt();
		sc.close();
		
		//executes until the condition returns true  
		for(i = 1; i <= num; ++i)  
		{  
		//adding the value of i into sum variable  
		sum = sum + i;  
		}  
		//prints the sum   
		System.out.println("Sum of First 10 Natural Numbers is = " + sum);

	}

}
