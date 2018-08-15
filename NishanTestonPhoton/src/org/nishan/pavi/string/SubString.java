package org.nishan.pavi.string;

public class SubString {

	public static void main(String[] args) {
		
		String date = "11/12/2017";
		
		date = date.substring(6, 10) + date.substring(3, 5) + date.substring(0, 2);
		System.out.println(date);

	}

}
