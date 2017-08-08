package com.tanlan.java8s4.format;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormateDemo {

	public static void main(String[] args) {
		DateFormat f1=DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.US);
		System.out.println(f1.format(new Date()));
		
		SimpleDateFormat f2=new SimpleDateFormat("yyyy/MM/dd");
		f2.applyPattern("MM-dd-yyyy");
		System.out.println(f2.format(new Date()));
	}

}
