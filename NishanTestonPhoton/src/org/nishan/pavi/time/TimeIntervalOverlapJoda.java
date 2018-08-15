package org.nishan.pavi.time;

import java.util.Calendar;
import java.util.Date;

import org.joda.time.Chronology;
import org.joda.time.Interval;
import org.joda.time.ReadableInterval;
import org.joda.time.base.AbstractInterval;

public class TimeIntervalOverlapJoda {

	public static void main(String[] args) {

		TimeIntervalOverlapJoda obIntervalOverlapValidation = new TimeIntervalOverlapJoda();
		
		Date start1 = obIntervalOverlapValidation.getDate(5);
		System.out.println("start1 :: " + start1);
		
		Date end1 = obIntervalOverlapValidation.getDate(5);
		System.out.println("end1 :: " + end1);
		
		Date start2 = obIntervalOverlapValidation.getDate(4);
		System.out.println("start2 :: " + start2);
		
		Date end2 = obIntervalOverlapValidation.getDate(7);
		System.out.println("end2 :: " + end2);
		
	}
	
	Date getDate(int month) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, month);
		
		return cal.getTime();
		
	}

}
