package com.cloud.config;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		System.out.println(DateTest.convertTimeZones1("America/Los_Angeles", "2018-11-05T09:00:00" ));
		
		
		
	}  
 

	
	public static String convertTimeZones1(final String toTimeZoneString, final String fromDateTime) {
	    final DateTimeZone fromTimeZone = DateTimeZone.forID("America/New_York");
	    final DateTimeZone toTimeZone = DateTimeZone.forID(toTimeZoneString);
	    final DateTime dateTime = new DateTime(fromDateTime, fromTimeZone);
	    System.out.println(dateTime);

	    final DateTimeFormatter outputFormatter = DateTimeFormat.forPattern("yyyy-MM-dd H:mm:ss").withZone(toTimeZone);
	    return outputFormatter.print(dateTime);
	}
}
