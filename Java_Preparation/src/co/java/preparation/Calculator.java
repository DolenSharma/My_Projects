package co.java.preparation;

import java.util.Scanner;

public class Calculator {
	
	
	public static void main(String[] args) {
		
	 	 Scanner sc = new Scanner(System.in);
	 	 System.out.println("Enter first number");
	 	 int no1 = sc.nextInt();
	 	 
	 	 System.out.println("Enter second number");
	 	 int no2 = sc.nextInt();
	 	  
	 	 System.out.println("Enter required operation [+, -, *, /]: ");
	 	 char operator = sc.next().charAt(0);//reading next first index
	 	 
	 	 if(operator == '+' || operator == '-' || operator == '/' || operator == '*') {
	 	
	 	  int res = calculate(no1,no2,operator);//function call
	 	  System.out.println(no1 + " "+operator+" "+ no2+ " = "+res);
	 	 }
	 	 else {
	 		 System.out.println("The operator is invalid");
	 		 
	 	 }
	 	 sc.close();
	 	 
	 	 
		
	}
	
	
	//--method to perform operations
	
	static int calculate(int x, int y, char operator) {
		int res = 0;
		
		switch(operator)
		{
		case '+':
			res = x + y;
		break;
		
		case '-':
			res = x - y;
		break;
		
		case '*':
			res = (x * y);
		
		case '/':
			res = x / y;
			break;
			
		
		}//switch
		return res;
	}//method calculate
		

}//class
