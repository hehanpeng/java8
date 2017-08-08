package com.tanlan.java8s4.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class MethodDemo {

	public static void main(String[] args) {
		LocalDate d1 = LocalDate.of(2014, Month.JANUARY, 25);
		System.out.println(d1);

		LocalDateTime t1 = LocalDateTime.of(2013, 1, 3, 11, 57);
		System.out.println(LocalDate.from(t1));

		LocalDate d2 = d1.withYear(2015).withMonth(3);
		System.out.println(d2);

		System.out.println(d2.getYear() + "," + d2.getMonthValue());

		long days = d2.toEpochDay();
		System.out.println(days);

		LocalTime t2 = t1.toLocalTime();
		System.out.println(t2);

		LocalDateTime t3 = d2.atTime(13, 25);
		System.out.println(t3);

		System.out.println(d2.atStartOfDay());

		System.out.println(d2);

		System.out.println(d2.plusDays(-7));
		System.out.println(d2.minusMonths(-1));
	}

}
