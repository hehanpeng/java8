package com.tanlan.java8s4.newtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewTimeDemo {

	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		System.out.println(d.getYear() + "," + d.getMonthValue() + ","
				+ d.getDayOfMonth());
		System.out.println(d);
		
		LocalTime t=LocalTime.now();
		System.out.println(t);
		
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		
		LocalDate d1=LocalDate.of(2012, 12, 3);
		LocalTime t1=LocalTime.of(12, 4, 7);
		System.out.println(d1);
		System.out.println(t1);
	}

}
