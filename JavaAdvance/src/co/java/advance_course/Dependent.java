package co.java.advance_course;

import java.text.DateFormat;
import java.util.Date;

public class Dependent {
	
	private final DateFormat format;
	public Dependent( final DateFormat format ) {
		this.format = format;
	}


	public String format( final Date date ) {
		return format.format( date );
		}

	
	

	//public static void main(String[] args, Object date) {


	//}

}
