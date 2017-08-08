package com.tanlan.java8s4.time;

import java.time.LocalDate;
import java.time.Month;

public class MonthDemo {
	public static void main(String[] args) {
		Month m = Month.OCTOBER;

		LocalDate d = LocalDate.of(2013, m, 12);

		Month m1 = Month.of(10);
		System.out.println(m1 == m);

		System.out.println(m1.plus(1).getValue());
		System.out.println(Month.from(d).getValue());
	}
}
