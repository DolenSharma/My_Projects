package com.roadmaptospringboot.ds;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your first name: ");
		String name = sc.nextLine();
		System.out.println("Please enter your family name: ");
		String lastName = sc.nextLine();
		sc.close();
		
		System.out.println("Your name is "+name+".");
		System.out.println(name.length());
		String s = String.valueOf(4);
		System.out.println(s);
		int a = Integer.parseInt("4");
		System.out.println(a);
		
		//charAt
		
		//for(int i = 0; i<name.length(); i++) {
			//System.out.println(name.charAt(i));
			
			
			//compareTo
			//s1 > s2: +ve value
			//s1 = s2: 0 
			//s1 < s2: -ve value
			
			if(name.compareTo(lastName) == 0) {
				System.out.println("Strings are equal");
			}else {
				System.out.println("Strings are not equal");
			}
		}

	}


