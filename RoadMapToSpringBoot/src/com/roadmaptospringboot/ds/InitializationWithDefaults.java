package com.roadmaptospringboot.ds;

public class InitializationWithDefaults {
	
	
	final InitializationWithDefaults initializationWithDefaults = new InitializationWithDefaults();
	
	
	
	private boolean booleanMember;
	private byte byteMember;
	private short shortMember;
	private int intMember;
	private long longMember;
	private char charMember;
	private float floatMember;
	private double doubleMember;
	private Object referenceMember;
	
	
	
	public InitializationWithDefaults() {
		System.out.println( "booleanMember = " + booleanMember );
		System.out.println( "byteMember = " + byteMember );
		System.out.println( "shortMember = " + shortMember );
		System.out.println( "intMember = " + intMember );
		System.out.println( "longMember = " + longMember );
		System.out.println( "charMember = " +
		Character.codePointAt( new char[] { charMember }, 0 ) );
		System.out.println( "floatMember = " + floatMember );
		System.out.println( "doubleMember = " + doubleMember );
		System.out.println( "referenceMember = " + referenceMember );
		}


	public static void main(String[] args) {
		
		//final InitializationWithDefaults initializationWithDefaults = new InitializationWithDefaults();
		InitializationWithDefaults();

		

	}


	private static void InitializationWithDefaults() {
		// TODO Auto-generated method stub
		
	}


	

}
