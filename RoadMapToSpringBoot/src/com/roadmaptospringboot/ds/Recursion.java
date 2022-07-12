package com.roadmaptospringboot.ds;

public class Recursion {
	

	public static void main(String[] args) {
		
		    int result = sum((int)(Math.random() * 10));
		    System.out.println(result);

	}
	
	
	public static int sum(int k) {
	    if (k > 0) {
	      return k + (k - 1);
	    } else {
	      return 0;
	    }

           } 
}
