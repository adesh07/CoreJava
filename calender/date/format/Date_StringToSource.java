package calender.date.format;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_StringToSource {

	public static void main(String[] args) throws ParseException {
		
		String src_dt = "29/02/2020";
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date d = sdf.parse(src_dt);
		
		System.out.println(d);
	}
}