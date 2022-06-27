
public class Feb_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("She Said \n \t \t \"Hello!\" \n to me.");
		System.out.println(Character.isLetter('C'));
		System.out.println(Character.isLetter('5'));
		int x = Integer.parseInt("9");
		double c = Double.parseDouble("5");
		int b = Integer.parseInt("444",16);
		
		System.out.println(x);
		System.out.println(c);
		System.out.println(b);
		
		
		System.out.println(Integer.toString(444,16));
		String welcome = "Welcome to the class.";
		System.out.println(welcome.substring(0));
		System.out.println(welcome.substring(5, 10));
		System.out.println(welcome.substring(5, 21));
		System.out.println(welcome.length());
		System.out.println("Upper and Lower Case");
		System.out.println(welcome.toLowerCase());
		System.out.println(welcome.toUpperCase());
		System.out.println("Trim");
		//Trim begining ra end ma problem xa vane trim is used
		String s1 = "     Eevryone    ";
		System.out.println(s1);
		System.out.println(s1.trim());
		System.out.println("Concatination");
		System.out.println(welcome.concat(s1));
		System.out.println(welcome.concat(s1.trim()));
		System.out.println(welcome + s1);
		System.out.println("Convert all string into char array ");
		   char[] chars = welcome.toCharArray();
		   System.out.println(chars);
		   System.out.println();
		   for(int i=0; i<chars.length; i++) { 
		   System.out.println(chars[i]);
		}
       System.out.println("Use charAt()");
       System.out.println(welcome.charAt(5));
       System.out.println("Compare");
       System.out.println("Check the given email address is valid or not by using indexOf method");

	}

}
