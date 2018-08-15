package org.nishan.pavi.time;

import java.util.Calendar;
import java.util.Date;

public class TimeIntervalOverlapValidation {

	public static void main(String[] args) {

		TimeIntervalOverlapValidation obIntervalOverlapValidation = new TimeIntervalOverlapValidation();
		
		Date start1 = obIntervalOverlapValidation.getDate(5);
		System.out.println("start1 :: " + start1);
		
		Date end1 = obIntervalOverlapValidation.getDate(5);
		System.out.println("end1 :: " + end1);
		
		Date start2 = obIntervalOverlapValidation.getDate(4);
		System.out.println("start2 :: " + start2);
		
		Date end2 = obIntervalOverlapValidation.getDate(7);
		System.out.println("end2 :: " + end2);
		
		System.out.println("isOverLaped :: " +obIntervalOverlapValidation.isOverLaped(start1, end1, start2, end2));
		
		System.out.println("DONE");
		
		System.out.println("Commit Test");

	}
	
	boolean isOverLaped(Date start1,Date end1,Date start2,Date end2) throws NullPointerException {
		
	    if ((start1.before(start2) && end1.after(start2)) || 
	        (start1.before(end2) && end1.after(end2)) || 
	        (start1.before(start2) && end1.after(end2)) ||
	        (start1.after(start2) && end1.before(end2))) {
	        return true;
	    } else {
	        return false;
	    }
	    
	}
	
	Date getDate(int month) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, month);
		
		return cal.getTime();
		
	}

}
