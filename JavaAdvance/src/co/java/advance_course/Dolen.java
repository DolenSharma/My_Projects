package co.java.advance_course;

import java.util.Scanner;

public class Dolen implements Cloneable {
	
	
	
	String hair;
	String face;
	String eyes;
	
	public static String getDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your Name, hair color, eyes color and face shape: ");
		String name = sc.nextLine();
		String hair = sc.nextLine();
		String eyes = sc.nextLine();
		String face = sc.nextLine();
		sc.close();
	    System.out.println("Name: "+name +" Hair color: "+ hair+" eyes color: "+ eyes+ " and Face: "+ face);
		return eyes;
		
	}
	//using toString() method
	public String toString() {
		return "Hair color: " + hair +", Face color: "+ face + " and  Eyes Color: " + eyes+".";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	

	public static void main(String[] args) throws 
	                  CloneNotSupportedException {
		Dolen dolen1 = new Dolen();
		
		dolen1.hair = "Black";
		dolen1.face = "Round";
		dolen1.eyes = "Brown";

   System.out.println("Properties of Dolen are: ");
   System.out.println(dolen1);//if you do not use toString method, hash value will be the o/p.
  
    Dolen dolen2 = (Dolen)dolen1.clone(); //Object cloning.
    
    System.out.println(dolen2);
    getDetails();
	} 
	

}
