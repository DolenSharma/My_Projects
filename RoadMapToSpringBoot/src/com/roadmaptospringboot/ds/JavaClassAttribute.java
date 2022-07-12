//In the previous chapter, we used the 
//term "variable" for x in the example 
//(as shown below). It is actually an 
//attribute of the class. Or you could 
//say that class attributes are variables 
//within a class:


package com.roadmaptospringboot.ds;

public class JavaClassAttribute {
	  final int x = 89;

	public static void main(String[] args) {
		    JavaClassAttribute myObj = new JavaClassAttribute();
		    //modify attributes If you don't 
		    //want the ability to override existing values, 
		    //declare the attribute as "final".
		    //myObj.x = 40;
		    System.out.println(myObj.x);
		    
		    /* The final keyword is useful 
		     * when you want a variable to 
		     * always store the same value, 
		     * like PI (3.14159...).

              The final keyword is called a "modifier". 
              You will learn more about these 
              in the Java Modifiers Chapter.*/

	}

}
