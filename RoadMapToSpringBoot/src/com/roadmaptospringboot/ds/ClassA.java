package com.roadmaptospringboot.ds;

public class ClassA {
	
	
	static int plusMethod(int x, int y) {
		  return x + y;
		}

		static double plusMethod(double x, double y) {
		  return x + y;
		  }

	public static void main(String[] args) {
		
		
		//Instead of defining two methods that should do the same thing, it is better to overload one.

		//In the example below, we overload the plusMethod method to work for both int and double:
		  int myNum1 = plusMethod(8, 5);
		  double myNum2 = plusMethod(4.3, 6.26);
		  System.out.println("int: " + myNum1);
		  System.out.println("double: " + myNum2);
		
		/*int myInt = 9;
		double myDouble = myInt; // Automatic casting: int to double
		System.out.println(myInt);      // Outputs 9
	    System.out.println(myDouble);   // Outputs 9.0
		*/
		int randomNum = (int)(Math.random() * 101);  // 0 to 100
		double myDouble = 9.78d;
	    int myInt = (int) myDouble; // Manual casting: double to int

	    System.out.println(myDouble);   // Outputs 9.78
	    System.out.println(myInt);      // Outputs 9
		
		   ClassA myObj = new ClassA();
		    
		   myObj.myMethod();
		   
		   String txt = "We are the so-called \"Vikings\" from the north.";
		   String[] cars = {"Volvo", "BMW", "Ford"};
		   System.out.println(  cars.length + " "+"and "+ txt + "Also random numbers: " + randomNum);
		   
		   
		   //for loop in array
		   
		    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		    for (int i = 0; i < myNumbers.length; ++i) {
		      for(int j = 0; j < myNumbers[i].length; ++j) {
		        System.out.println("Arrays are: " + myNumbers[i][j]);
		      }
		    }

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
