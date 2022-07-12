package co.java.advance_course;

import java.util.Scanner;

interface Client 
{
	void input(); //public + abstract by default
	void output(); //public + abstract by default
}

class Raju implements Client
{
	String name;
	double sal;
	
	
	public void input() //Client's requirement
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter username: ");
	name = sc.nextLine();
	
	
	System.out.println("Enter salary: ");
	sal = sc.nextDouble();
	
	sc.close();
	
		
	}
	//O/p method
	public void output()
	{
		System.out.println(name + "  " + sal);
	}
}
	
	public class Interface
	{
		public static void main(String[] args)
		{
			Client c = new Raju();
			c.input();
			c.output();
		}
	
	
}