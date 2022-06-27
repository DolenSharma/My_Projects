package co.java.preparation;

public class BitWiseOperator {

	public static void main(String[] args) {
		int n1 = 11; //00001011
		int n2 = 22; //00010110
		System.out.println("n1 & n2 : "+(n1 & n2));
		System.out.println("n1 OR n2 : "+(n1 | n2));
		System.out.println("n1 ^ n2 : "+(n1 ^ n2));
		System.out.println("NOT n1 : "+(~n1));
		System.out.println("n1 << 2 : "+(n1 << 2));
		System.out.println("n1 >> 4 : "+(n2 >> 4));
	}

}
