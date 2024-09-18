package coreJava;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class dateFormat {
	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d.toString());
		SimpleDateFormat sdf = new SimpleDateFormat("MMM-dd-y");
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
	System.out.println(cal.getTime());
	System.out.println(cal.get(Calendar.AM_PM));
	System.out.println(cal.get(Calendar.MONTH));
	}

}
