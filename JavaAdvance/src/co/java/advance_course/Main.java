package co.java.advance_course;

abstract class Programming {
	
	public abstract void Developer();
	public abstract void Rank();
	
}
abstract class HTML extends Programming
{
	@Override
	public void Developer()
	{
		System.out.println("Tim Berners Lee");
	}
	
	
}
class Java extends HTML
{
	@Override
	public void Rank()
	{
		System.out.println("1st");
	}
}

class Main
{
	public static void main(String[] args) {
		
		Programming h = new Java(); //Abstract class can provide reference to object
		//Instead of Programming HTML and Java can be used 
		h.Developer(); h.Rank();
		//Programming j = new Java();
		//j.Developer(); //j .Rank();
		
		
		
	}
}
