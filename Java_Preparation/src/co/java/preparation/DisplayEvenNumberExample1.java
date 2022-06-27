package co.java.preparation;

import java.util.Scanner;

public class DisplayEvenNumberExample1 {
	
	/*Using "modulo method"
	 * public static void main(String args[])   
	{  
	int number=100;  
	System.out.print("List of even numbers from 1 to "+number+": ");  
	for (int i=1; i<=number; i++)   
	{  
	//logic to check if the number is even or not  
	//if i%2 is equal to zero, the number is even  
	if (i%2==0)   
	{  
	System.out.print(i + " ");  
	}  
	} */
	
	/*Using nested if
	 * public static void main(String[] args)   
	{  
	System.out.println("List of even numbers: ");       
	//method calling  
	displayEvenNumbers(1, 100);   
	}   
	//method that checks the number is even or not  
	private static void displayEvenNumbers(int number, int end)   
	{   
	if(number>end)   
	return;   
	if(number%2==0)   
	{   
	//prints the even numbers  
	System.out.print(number +" ");   
	//calling the method and increments the number by 2 if the number is even  
	displayEvenNumbers(number + 2, end);   
	}   
	else   
	{   
	//increments the number by 1 if the number is odd  
	displayEvenNumbers(number + 1, end);   
	}   
	}   */
	//using while loop
	public static void main(String[] args)   
	{  
	int number, i;  
	Scanner sc=new Scanner(System.in);  
	System.out.print("Enter the limit: ");  
	number = sc.nextInt();    
	i=2;  
	sc.close();
	System.out.print("List of even numbers: ");  
	//the while loop executes until the condition become false  
	while(i<=number)  
	{  
	//prints the even number  
	System.out.print(i +" ");   
	//increments the variable i by 2  
	i=i+2;  
	}     
	}  
	
	
	}  
	


