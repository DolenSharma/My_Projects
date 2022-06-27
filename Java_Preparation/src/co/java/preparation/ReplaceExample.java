package co.java.preparation;

import java.util.Scanner;

public class ReplaceExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string for checking: ");
	 	String word = sc.next();
	 	sc.close();
	 	
	 	if(word.charAt(0) == 'x') {
	 		word = word.replace('x', 'z');
	 		System.out.println("The new string is "+word);
	 	}else {
	 		String word2 = word.replace("x","ecks");
	 		System.out.println("The new string is "+word2);
	 	}
	 		
	 	}
		
			

}
