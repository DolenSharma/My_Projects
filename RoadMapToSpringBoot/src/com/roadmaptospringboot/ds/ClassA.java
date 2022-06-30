package com.roadmaptospringboot.ds;

public class ClassA {

	public static void main(String[] args) {
		
		/*int myInt = 9;
		double myDouble = myInt; // Automatic casting: int to double
		System.out.println(myInt);      // Outputs 9
	    System.out.println(myDouble);   // Outputs 9.0
		*/
		double myDouble = 9.78d;
	    int myInt = (int) myDouble; // Manual casting: double to int

	    System.out.println(myDouble);   // Outputs 9.78
	    System.out.println(myInt);      // Outputs 9
		
		   ClassA myObj = new ClassA();
		    
		   myObj.myMethod();
		   
		   String txt = "We are the so-called \"Vikings\" from the north.";
		   String[] cars = {"Volvo", "BMW", "Ford"};
		   System.out.println(  cars.length + " "+"and "+ txt );

	}
		
		
		
		/*
		
		System.out.println(Math.random());
		
		int x = 10;
		int y = 9;
		System.out.println(x > y);
		
		//ternery operator
		int time = 10;
		String result = (time < 18)?"Good day." : "Good evening.";
		System.out.println(result); 
	
		
		int i = 1;
		do
		 {
		  System.out.println(i);
		  i++;
		}
		while
		 (i < 6);
			
		//Loop through the items in the cars array.
		String[] cars = {"Volvo", "BMW", "Ford"};
		for
		 (String i : 
		cars
		) {
		  System.out.println(i);
		}
		
		 int[][] myNumbers = { {1, 2, 3}, {5, 6, 7} };
		 System.out.println(myNumbers);
		 */
		 
	    void myMethod() {
		  System.out.println("I am called as myMethod on the object.");
		  
		 
		}

		

}
