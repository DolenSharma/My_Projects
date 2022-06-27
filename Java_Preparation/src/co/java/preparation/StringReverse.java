package co.java.preparation;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the line of text to reverse: ");
	 	String text = sc.nextLine();
	 	
	 	String revText = reverseString(text);
	 	System.out.println(text);
	 	System.out.println(revText);
	 	sc.close();
	 	 
	 	//System.out.println(text.indexOf("e"));
	 			


	}
    static String reverseString(String text) {
    	String[] words = text.split(" ");
    	String revString = "";
    	for(String word : words) {
    		StringBuilder sb = new StringBuilder(word);
    		revString = revString + sb.reverse()+" ";
    	}
    
    	return revString;
    	
    	
    }
}
