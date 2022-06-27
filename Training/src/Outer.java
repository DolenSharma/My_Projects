
public class Outer {
	private static String text = "i am private";
	public static class Inner{
		public void printText() {
			System.out.println(text);
		}
	}

}
