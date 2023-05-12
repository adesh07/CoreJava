package calender.date.format;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_date {
	
	public static void main(String[] args) throws ParseException {
		

		// Converting Date(type) into String(type) 
		
		Date aaj = new Date();
		
		SimpleDateFormat jthj = new SimpleDateFormat("dd/MM/yyyy");
		
		String hutt = jthj.format(aaj);
		
		System.out.println(hutt);
		
		// converting String(input date) into Date(type)
		
		String fkfk = "01/01/1857";
		
		Date yo = jthj.parse(fkfk);
		
		System.out.println(yo);

	}

}
