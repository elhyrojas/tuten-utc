package com.tuten.utc.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Util {
	
	public static String getFormatUtc(LocalTime time, String timezone) throws Exception {
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
		timeFormat.setTimeZone(TimeZone.getTimeZone("GMT" + timezone));
		
		try {
			Date timeReceived;
			System.out.println(time);
			if (time.getSecond() == 0) {
				String newTime = time + ":00";
				timeReceived = timeFormat.parse(newTime);
			}
			else {
				timeReceived = timeFormat.parse(time.toString());	
			}
			System.out.println(timeReceived);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(timeReceived);
			SimpleDateFormat newFormat = new SimpleDateFormat("HH:mm:ss");
			newFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
			
			return newFormat.format(calendar.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		throw new Exception("No es posible realizar la conversión.");
	}

}
