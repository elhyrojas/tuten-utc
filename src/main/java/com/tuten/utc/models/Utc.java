package com.tuten.utc.models;

import java.time.LocalTime;

import com.tuten.utc.utils.Util;

public class Utc {
	private LocalTime time;
	private String timezone;
	
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	
	public UtcResponse getResponse() {
		try {
			return new UtcResponse(Util.getFormatUtc(time, timezone));
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private class UtcResponse {
		private String time;
		private static final String timezone = "utc";
		
		public String getTime() {
			return time;
		}
		public void setTime(String time) {
			this.time = time;
		}
		public String getTimezone() {
			return timezone;
		}
		public UtcResponse(String time) {
			this.time = time;
		}
	}
}
