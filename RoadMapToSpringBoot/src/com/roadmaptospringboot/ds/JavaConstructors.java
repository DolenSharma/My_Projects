package com.roadmaptospringboot.ds;

public class JavaConstructors {
	
	/* int x;  //Create a class attributes
	//Create a class constructor for the JavaConstructo
	public JavaConstructors(int y) {
		
	//	x = 5; //Set initial value for the class attribute x
	x = y;	
	}

	public static void main(String[] args) {
		JavaConstructors myObj = new JavaConstructors(50); // Create an object of class Main (This will call the constructor)
		System.out.println(myObj.x); //Print the value of x

	}
	*/
	int modelYear;
	String modelName;
	
	public JavaConstructors(int year, String name) {
		
		modelYear = year;
		modelName = name;
		
		}
	
	
	public static void main(String[] args) {
		
		JavaConstructors myCar = new JavaConstructors(1996, "Mustang"); //Created an object 
		System.out.println("Car Moddel Year: "+ myCar.modelYear + " " + "Car Name: " + myCar.modelName);
	}
	
}
