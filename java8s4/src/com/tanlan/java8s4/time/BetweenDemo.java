package com.tanlan.java8s4.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class BetweenDemo {

	public static void main(String[] args) {

		LocalDate d1 = LocalDate.of(2013, 12, 1);
		LocalDate d2 = LocalDate.now();
		long days = ChronoUnit.MONTHS.between(d1, d2);
		System.out.println(days);

		System.out.println(d1.until(d2));
		System.out.println(d1.until(d2, ChronoUnit.MONTHS));

		LocalTime t = LocalTime.now();
		//long days1 = ChronoUnit.MONTHS.between(d1, t);
		//System.out.println(days1);
		LocalTime t1=LocalTime.of(22, 10);
		System.out.println(ChronoUnit.MINUTES.between(t, t1));
	}

}
